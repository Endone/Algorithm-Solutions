package test;

public class TecentInterview {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(10);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(8);
		TreeNode node5 = new TreeNode(16);
		TreeNode node6 = new TreeNode(12);
		TreeNode node7 = new TreeNode(18);
		node.left = node2;
		node.right = node5;
		node2.left = node3;
		node2.right = node4;
		node5.left = node6;
		node5.right = node7;
		bst2LinkedList(node);
	}

	/**
	 * 将二叉查找树转换为双向顺序链表
	 * 
	 * @param root
	 * @return
	 */
	public static TreeNode bst2LinkedList(TreeNode root) {
		return bst2LinkedList(root, false);
	}

	public static TreeNode bst2LinkedList(TreeNode root, boolean flag) {
		if (root == null)
			return root;
		TreeNode left = null;
		TreeNode right = null;
		if (root.left != null) {
			left = bst2LinkedList(root.left, true);
			root.left = left;
			left.right = root;
		}
		if (root.right != null) {
			right = bst2LinkedList(root.right, false);
			root.right = right;
			right.left = root;
		}
		if (left == null && right == null)
			return root;

		return flag ? right : left;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
