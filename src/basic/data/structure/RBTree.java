package basic.data.structure;

public class RBTree<T extends Comparable<T>> {
	public RBNode<T> root;
	private static final boolean RED = false;
	private static final boolean BLACK = true;

	@SuppressWarnings("hiding")
	public class RBNode<T extends Comparable<T>> {
		boolean color;
		public T key;
		RBNode<T> left;
		RBNode<T> right;
		RBNode<T> parent;

		public RBNode(T key, boolean color, RBNode<T> parent, RBNode<T> left,
				RBNode<T> right) {
			this.key = key;
			this.color = color;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
	}

	public void LeftRotate(RBNode<T> x) {
		RBNode<T> y = x.right;// y为x的右孩子
		x.right = y.left;// y的左孩子赋给x的右孩子
		if (y.left != null)// y的左孩子不为空的情况下，x赋给y的父节点
			y.left.parent = x;
		y.parent = x.parent;// y的父节点指向x的父节点
		if (x.parent == null)// 如果x为根节点，则y称为新的根节点
			this.root = y;
		else if (x.parent.left == x)// 判断x是其父节点的左孩子还是右孩子
			x.parent.left = y;// 如果是左孩子，则y也为新的父节点的左孩子
		else
			x.parent.right = y;// 否则，y为新的父节点的右孩子
		y.left = x;// x成为y的左孩子
		x.parent = y;// y为x新的父节点
	}

	public void RightRotate(RBNode<T> x) {
		RBNode<T> y = x.left;
		x.left = y.right;
		if (y.right != null)
			y.right.parent = x;
		y.parent = x.parent;
		if (x.parent == null)
			root = y;
		else if (x.parent.left == x)
			x.parent.left = y;
		else
			x.parent.right = y;
		y.right = x;
		x.parent = y;
	}

	public void Insert(T key) {
		RBNode<T> node = new RBNode<T>(key, BLACK, null, null, null);
		// 如果新建结点失败，则返回。
		Insert(node);
	}

	public void Insert(RBNode<T> z) {
		RBNode<T> x = this.root;
		RBNode<T> y = null;
		while (x != null) {
			y = x;
			if (x.key.compareTo(z.key) > 0)
				x = x.left;
			else
				x = x.right;
		}
		z.parent = y;
		if (y == null)
			root = z;
		else if (y.key.compareTo(z.key) > 0)
			y.left = z;
		else
			y.right = z;
		z.color = RED;
		Insert_Fixup(z);
	}

	private void Insert_Fixup(RBNode<T> z) {
		while (z.parent != null && z.parent.color == RED) {
			if (z.parent == z.parent.parent.left) {
				RBNode<T> y = z.parent.parent.right;
				if (y != null && y.color == RED) {
					z.parent.color = BLACK;
					z.parent.parent.color = RED;
					y.color = BLACK;
					z = z.parent.parent;
					continue;
				}
				if (z == z.parent.right) {
					z = z.parent;
					LeftRotate(z);
				}
				z.parent.color = BLACK;
				z.parent.parent.color = RED;
				RightRotate(z.parent.parent);
			} else {
				RBNode<T> y = z.parent.parent.left;
				if (y != null && y.color == RED) {
					z.parent.color = BLACK;
					z.parent.parent.color = RED;
					y.color = BLACK;
					z = z.parent.parent;
					continue;
				}
				if (z == z.parent.left) {
					z = z.parent;
					RightRotate(z);
				}
				z.parent.color = BLACK;
				z.parent.parent.color = RED;
				LeftRotate(z.parent.parent);
			}
		}
		this.root.color = BLACK;
	}

	public void delete(T key) {
		RBNode<T> node;
		if ((node = search(key)) != null)
			delete(node);
	}

	public void delete(RBNode<T> z) {
		RBNode<T> y = null;
		if (z.left == null || z.right == null)
			y = z;
		else
			y = Tree_Successor(z);
		RBNode<T> x = null;
		if (y.left != null)
			x = y.left;
		else
			x = y.right;
		if (x != null)
			x.parent = y.parent;
		if (y.parent == null)
			root = x;
		else if (y == y.parent.left)
			y.parent.left = x;
		else
			y.parent.right = x;
		if (y != z)
			z.key = y.key;
		if (x != null && y.color == BLACK)
			Delete_Fixup(x);
		z = null;
	}

	private void Delete_Fixup(RBNode<T> x) {
		while (x != root && (x == null || x.color == BLACK)) {
			if (x == x.parent.left) {
				RBNode<T> w = x.parent.right;
				if (w.color == RED) {
					x.parent.color = RED;
					w.color = BLACK;
					LeftRotate(x.parent);
					w = x.parent.right;
				}
				if ((w.left != null || w.left.color == BLACK)
						&& (w.right != null || w.right.color == BLACK)) {
					w.color = RED;
					x = x.parent;
				} else {
					if (w.right == null || w.right.color == BLACK) {
						w.left.color = BLACK;
						w.color = RED;
						RightRotate(w);
						w = x.parent.right;
					}
					w.color = x.parent.color;
					x.parent.color = BLACK;
					w.right.color = BLACK;
					LeftRotate(x.parent);
					x = this.root;
				}
			} else {
				RBNode<T> w = x.parent.left;
				if (w.color == RED) {
					x.parent.color = RED;
					w.color = BLACK;
					RightRotate(x.parent);
					w = x.parent.left;
				}
				if ((w.left != null || w.left.color == BLACK)
						&& (w.right != null || w.right.color == BLACK)) {
					w.color = RED;
					x = x.parent;
				} else {
					if (w.left == null || w.left.color == BLACK) {
						w.right.color = BLACK;
						w.color = RED;
						LeftRotate(w);
						w = x.parent.left;
					}
					w.color = x.parent.color;
					x.parent.color = BLACK;
					w.left.color = BLACK;
					RightRotate(x.parent);
					x = this.root;
				}
			}
		}
		x.color = BLACK;
	}

	public RBNode<T> Tree_Successor(RBNode<T> x) {
		if (x.right != null)
			return Tree_Minimum(x.right);
		RBNode<T> y = x.parent;
		while (y != null && y == y.parent.right)
			y = y.parent;
		return y;
	}

	public RBNode<T> Tree_Predecessor(RBNode<T> x) {
		if (x.left != null)
			return Tree_Maximum(x.left);
		RBNode<T> y = x.parent;
		while (y != null && y == y.parent.left)
			y = y.parent;
		return y;
	}

	public RBNode<T> Tree_Minimum(RBNode<T> x) {
		while (x.left != null)
			x = x.left;
		return x;
	}

	public RBNode<T> Tree_Maximum(RBNode<T> x) {
		while (x.right != null)
			x = x.right;
		return x;
	}

	private RBNode<T> search(T key) {
		RBNode<T> node = new RBNode<T>(key, BLACK, null, null, null);
		return search(node);
	}

	private RBNode<T> search(RBNode<T> z) {
		RBNode<T> x = this.root;
		RBNode<T> y = null;
		while (x != null) {
			y = x;
			if (x.key.compareTo(z.key) > 0) {
				x = x.left;
			} else if (x.key.compareTo(z.key) < 0) {
				x = x.right;
			} else {
				return y;
			}
		}
		return null;
	}

	public void print() {
		if (root != null)
			print(root, root.key, 0);
	}

	public void print(RBNode<T> tree, T key, int direction) {
		if (tree != null) {
			if (direction == 0)
				System.out.printf("%2d(B) is root\n", tree.key);
			else
				System.out.printf("%2d(%s) is %2d's %6s child\n", tree.key,
						(tree.color == RED) ? "R" : "B", key,
						direction == 1 ? "right" : "left");

			print(tree.left, tree.key, -1);
			print(tree.right, tree.key, 1);
		}
	}

	private void destroy(RBNode<T> tree) {
		if (tree == null)
			return;

		if (tree.left != null)
			destroy(tree.left);
		if (tree.right != null)
			destroy(tree.right);

		tree = null;
	}

	public void clear() {
		destroy(root);
		root = null;
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(RBNode<T> node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.key + " ");
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(RBNode<T> node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.key + " ");
			inOrder(node.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(RBNode<T> node) {
		if (node != null) {
			System.out.print(node.key + " ");
			preOrder(node.left);
			preOrder(node.right);

		}
	}
}
