package code.interview.one;

/**
 * 题目：输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。要求不能创建任何新的结点，只调整指针的指向。 　　比如将二元查找树 10 / \ 6
 * 14 / \ /　 \ 　 4 8 12 16 转换成双向链表
 * 
 * 4=6=8=10=12=14=16。
 * 
 * @author Administrator
 * 
 */
public class Main {
	private static BSTreeNode list = null;

	public static void main(String[] args) {
		BSTreeNode head = new BSTreeNode();
		head.m_nValue = 10;
		BSTreeNode node1 = new BSTreeNode();
		node1.m_nValue = 6;
		BSTreeNode node2 = new BSTreeNode();
		node2.m_nValue = 14;
		BSTreeNode node3 = new BSTreeNode();
		node3.m_nValue = 4;
		BSTreeNode node4 = new BSTreeNode();
		node4.m_nValue = 8;
		BSTreeNode node5 = new BSTreeNode();
		node5.m_nValue = 12;
		BSTreeNode node6 = new BSTreeNode();
		node6.m_nValue = 16;
		head.m_pLeft = node1;
		head.m_pRight = node2;
		node1.m_pLeft = node3;
		node1.m_pRight = node4;
		node2.m_pLeft = node5;
		node2.m_pRight = node6;
		// head = treeToLinkedList(head, true);
		// while (head != null) {
		// System.out.println(head.m_nValue);
		// head = head.m_pRight;
		// }
		treeToLinkedListWithInOrder(head);
		while (list != null) {
			System.out.println(list.m_nValue);
			list = list.m_pLeft;
		}
	}

	public static BSTreeNode treeToLinkedList(BSTreeNode head, boolean isRight) {
		if (head == null) {
			return null;
		}
		BSTreeNode headLeft = null;
		BSTreeNode headRight = null;
		if (head.m_pLeft != null)
			headLeft = treeToLinkedList(head.m_pLeft, false);
		if (headLeft != null) {
			headLeft.m_pRight = head;
			head.m_pLeft = headLeft;
		}
		if (head.m_pRight != null)
			headRight = treeToLinkedList(head.m_pRight, true);
		if (headRight != null) {
			headRight.m_pLeft = head;
			head.m_pRight = headRight;
		}
		BSTreeNode tmp = head;
		if (isRight) {
			while (tmp.m_pLeft != null) {
				tmp = tmp.m_pLeft;
			}
		} else {
			while (tmp.m_pRight != null) {
				tmp = tmp.m_pRight;
			}
		}
		return tmp;
	}

	public static void treeToLinkedListWithInOrder(BSTreeNode node) {
		if (node.m_pLeft != null) {
			treeToLinkedListWithInOrder(node.m_pLeft);
		}
		if (list == null) {
			list = node;
		} else {
			list.m_pRight = node;
			node.m_pLeft = list;
			list = list.m_pRight;
		}
		if (node.m_pRight != null) {
			treeToLinkedListWithInOrder(node.m_pRight);
		}
	}
}

class BSTreeNode {
	int m_nValue; // value of node
	BSTreeNode m_pLeft; // left child of node
	BSTreeNode m_pRight; // right child of node
}
