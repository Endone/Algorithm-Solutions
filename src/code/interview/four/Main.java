package code.interview.four;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Integer> ways = new ArrayList<Integer>();

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(12);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(7);
		TreeNode node6 = new TreeNode(8);
		TreeNode node7 = new TreeNode(9);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		waysOfTreeNodesOfSum(22, node1);
	}

	public static boolean waysOfTreeNodesOfSum(int sum, TreeNode node) {
		if (node == null) {
			System.out.println("No Such Way");
		}
		ways.add(node.value);
		if (isLeaf(node)) {
			if (sum == node.value) {
				for (Integer i : ways) {
					System.out.print(i + "-->");
				}
				System.out.println();
				return true;
			} else {
				return false;
			}
		} else {
			sum -= node.value;
			if (node.left != null) {
				waysOfTreeNodesOfSum(sum, node.left);
				ways.remove(ways.size() - 1);
			}
			if (node.right != null) {
				waysOfTreeNodesOfSum(sum, node.right);
				ways.remove(ways.size() - 1);
			}

		}
		return false;

	}

	private static boolean isLeaf(TreeNode node) {
		return node.left == null && node.right == null;
	}
}

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value) {
		this.value = value;
	}
}