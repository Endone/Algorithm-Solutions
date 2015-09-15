package interview;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StringAndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringAndArray test = new StringAndArray();
		int[][] val = new int[][] { { 1, 2, 0 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] res = test.transformImage(val, 3);
		int n = 3;

		res = test.clearZero(val, n);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				System.out.println(res[i][j]);
			}
		ListNode node = new ListNode(6);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(8);
		ListNode node4 = new ListNode(8);
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(6);
		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		// test.partition(node, 9);
		// test.plusAB(node, node);
		test.isPalindrome(node);
		System.out.println(test.getResult(385, 248));
	}

	public int[][] transformImage(int[][] mat, int n) {
		// write code here
		int[] buf = new int[n * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				buf[k++] = (mat[i][j]);
			}
		}
		int[][] res = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = (buf[(buf.length - n * (j + 1) + i)]);
			}
		}
		return res;
	}

	public int[][] clearZero(int[][] mat, int n) {
		// write code here
		boolean[] flagRow = new boolean[n];
		boolean[] flagCol = new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					flagRow[i] = true;
					flagCol[j] = true;
				}

			}
		}
		int[][] res = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (!flagRow[i])
				for (int j = 0; j < n; j++) {
					if (!flagCol[j]) {
						res[i][j] = mat[i][j];
					}
				}
		}
		return res;
	}

	public ListNode partition(ListNode pHead, int x) {
		// write code here
		ListNode before = null;
		ListNode beforeEnd = null;
		ListNode after = null;
		ListNode afterEnd = null;
		if (pHead == null || pHead.next == null)
			return pHead;
		while (pHead != null) {
			if (pHead.val < x) {
				if (before == null) {
					before = pHead;
					beforeEnd = pHead;
				} else {
					beforeEnd.next = pHead;
					beforeEnd = beforeEnd.next;
				}
			} else {
				if (after == null) {
					after = pHead;
					afterEnd = pHead;
				} else {
					afterEnd.next = pHead;
					afterEnd = afterEnd.next;
				}
			}
			pHead = pHead.next;
		}
		if (before == null)
			return after;
		else
			beforeEnd.next = after;
		return before;
	}

	public ListNode plusAB(ListNode a, ListNode b) {
		// write code here
		if (a == null)
			return b;
		if (b == null)
			return a;
		int carry = 0;
		ListNode head = null;
		ListNode res = null;
		while (a != null && b != null) {
			int sum = a.val + b.val + carry;
			carry = sum / 10;
			ListNode node = new ListNode(sum % 10);
			if (head == null) {
				head = node;
				res = node;
			} else {
				head.next = node;
				head = head.next;
			}
		}
		while (a != null) {
			int sum = a.val + carry;
			carry = sum / 10;
			ListNode node = new ListNode(sum % 10);
			head.next = node;
			head = head.next;
		}
		while (b != null) {
			int sum = b.val + carry;
			carry = sum / 10;
			ListNode node = new ListNode(sum % 10);
			head.next = node;
			head = head.next;
		}
		if (carry != 0) {
			ListNode node = new ListNode(1);
			head.next = node;
		}
		return res;
	}

	public ListNode plusABRecursive(ListNode a, ListNode b) {
		return addLists(a, b, 0);
	}

	public ListNode addLists(ListNode a, ListNode b, int carry) {
		if (a == null && b == null && carry == 0)
			return null;
		int sum = carry;
		if (a != null) {
			sum += a.val;
		}
		if (b != null) {
			sum += b.val;
		}
		ListNode head = new ListNode(sum % 10);
		carry = sum / 10;
		head.next = addLists(a == null ? null : a.next, b == null ? null
				: b.next, carry);
		return head;
	}

	public boolean isPalindrome(ListNode pHead) {
		// write code here
		Stack<Integer> stack = new Stack<Integer>();

		ListNode slow = pHead;
		ListNode fast = pHead;
		while (fast != null && fast.next != null) {// 两个检查的顺序不能错
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null)// 检测链表中元素的奇偶数
			slow = slow.next;
		while (slow != null) {
			int val = stack.pop();
			if (val != slow.val)
				return false;
			slow = slow.next;
		}
		return true;
	}

	public int getResult(int n, int m) {
		// write code here
		int s = 0;
		for (int i = 2; i <= n; i++)
			s = (s + m) % i;
		return s;
	}
}
