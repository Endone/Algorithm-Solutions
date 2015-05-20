package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
	/**
	 * Problem 1
	 * 
	 * @param numbers
	 * @param target
	 * @return two index whose sum equals to target
	 */
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				return new int[] { map.get(target - numbers[i]), i + 1 };
			}
			map.put(numbers[i], i + 1);
		}
		throw new IllegalArgumentException();
	}

	/**
	 * Problem 2
	 * 
	 * @param l1
	 * @param l2
	 * @return head of ListNode represent the sum of l1 and l2
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode head = new ListNode((l1.val + l2.val) % 10);
		ListNode cur = head;
		int inc = (l1.val + l2.val) / 10;
		l1 = l1.next;
		l2 = l2.next;
		while (l1 != null || l2 != null) {
			l1 = l1 == null ? new ListNode(0) : l1;
			l2 = l2 == null ? new ListNode(0) : l2;
			ListNode node = new ListNode((l1.val + l2.val + inc) % 10);
			inc = (l1.val + l2.val + inc) / 10;
			cur.next = node;
			cur = node;
			l1 = l1.next;
			l2 = l2.next;
		}
		if (inc != 0) {
			cur.next = new ListNode(inc);
		}
		return head;
	}

	/**
	 * Problem 3
	 * 
	 * @param s
	 * @return the length
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s.length() <= 1) {
			return s.length();
		}
		int max = 0;
		int length = 1;
		int start = 0;
		for (int i = 1; i < s.length(); i++) {
			String temp = s.substring(start, i);
			String se = s.charAt(i) + "";
			if (temp.contains(se)) {
				int po = temp.indexOf(se) + 1;
				start += po;
				length -= po - 1;
			} else {
				length++;
			}
			if (max < length) {
				max = length;
			}
		}
		return max;
	}

	/**
	 * problem 6
	 * 
	 * @param s
	 * @param numRows
	 * @return zigzag pattern of s
	 */
	public String convert(String s, int numRows) {
		return s;
	}

	/**
	 * Problem 7
	 * 
	 * @param x
	 * @return reverse value of xs
	 */
	public int reverse(int x) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		String str = x + "";
		StringBuilder res = new StringBuilder();
		if (x < 0) {
			res.append('-');
		}
		boolean flag = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			if ((flag == false && str.charAt(i) == '0' && x != 0)
					|| str.charAt(i) == '-') {
				continue;
			} else {
				res.append(str.charAt(i));
				flag = true;
			}
		}
		return Integer.parseInt(res.toString());
	}

	/**
	 * Problem 13
	 * 
	 * @param s
	 * @return integer value of s in Roman pattern
	 */
	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int length = s.length();
		int sum = 0;
		if (length == 0)
			return 0;
		if (length == 1) {
			return map.get(s.charAt(0));
		}
		for (int i = 0; i < length - 1; i++) {
			Integer pre = map.get(s.charAt(i));
			Integer aft = map.get(s.charAt(i + 1));
			if (pre >= aft) {
				sum += pre;
			} else {
				sum += aft - pre;
				i++;
			}
			if (i == length - 2) {
				sum += map.get(s.charAt(i + 1));
			}
		}
		return sum;
	}

	/**
	 * Problem 21
	 * 
	 * @param l1
	 * @param l2
	 * @return the sorted list of l1 and l2
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode res = null;
		ListNode cur = null;
		if (l1.val > l2.val) {
			res = new ListNode(l2.val);
			l2 = l2.next;
		} else {
			res = new ListNode(l1.val);
			l1 = l1.next;
		}
		res.next = null;
		cur = res;

		while (l1 != null || l2 != null) {
			if (l1 == null) {
				while (l2 != null) {
					cur.next = new ListNode(l2.val);
					l2 = l2.next;
					cur = cur.next;
				}
			} else if (l2 == null) {
				while (l1 != null) {
					cur.next = new ListNode(l1.val);
					l1 = l1.next;
					cur = cur.next;
				}
			} else {
				if (l1.val > l2.val) {
					cur.next = new ListNode(l2.val);
					l2 = l2.next;
				} else {
					cur.next = new ListNode(l1.val);
					l1 = l1.next;
				}
				cur = cur.next;
			}
		}
		return res;
	}

	/**
	 * Problem 27
	 * 
	 * @param A
	 * @param elem
	 * @return new length of A without elem
	 */
	public int removeElement(int[] A, int elem) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		int res = A.length;
		for (int i = 0; i < res;) {
			if (A[i] == elem) {
				if (i == res - 1) {
					System.arraycopy(A, 0, A, 0, res - 1);
				} else {
					A[i] = A[res - 1];
				}
				res--;
			} else {
				i++;
			}
		}
		return res;
	}

	/**
	 * Problem 35
	 * 
	 * @param A
	 * @param target
	 * @return the index if the target is found. If not, return the index where
	 *         it would be if it were inserted in order
	 */
	public int searchInsert(int[] A, int target) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (A[mid] > target) {
				high = mid - 1;
			} else if (A[mid] < target) {
				low = mid + 1;
			} else {
				low = mid;
				break;
			}
		}
		return low;
	}

	/**
	 * Problem 53
	 * 
	 * @param A
	 * @return largest sum of sub array
	 */
	public int maxSubArray(int[] A) {
		int res = Integer.MIN_VALUE;
		int tmp = 0;
		for (int i = 0; i < A.length; i++) {
			tmp += A[i];
			res = Math.max(res, tmp);
			if (tmp < 0)
				tmp = 0;
		}
		return res;
	}

	/**
	 * Problem70
	 * 
	 * @param n
	 * @return ways to climb n stairs
	 */
	public int climbStairs(int n) {
		if (n < 4)
			return n;
		int b = 3, c = 5;
		for (int i = 4; i < n; i++) {
			int tmp = b;
			b = c;
			c = tmp + c;
		}
		return c;
	}

	/**
	 * Problem 83
	 * 
	 * @param head
	 * @return head of ListNode without duplicate values
	 */
	public ListNode deleteDuplicates(ListNode head) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (head == null || head.next == null) {
			return head;
		}
		ListNode res = head;
		ListNode preNode = head;
		while (head.next != null) {
			head = head.next;
			if (head.val == preNode.val) {
				preNode.next = head.next;
			} else {
				preNode = head;
			}
		}
		return res;
	}

	/**
	 * Problem 94
	 * 
	 * @param root
	 * @return inorder traversal
	 */
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		if (root == null) {
			return res;
		}
		if (root.left != null) {
			res.addAll(inorderTraversal(root.left));
		}
		res.add(root.val);
		res.addAll(inorderTraversal(root.right));
		return res;
	}

	/**
	 * Problem 96
	 * 
	 * @param n
	 * @return number of Binary Search Tree with value 1..n
	 */
	public int numTrees(int n) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (n <= 2) {
			return n;
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				sum += numTrees(i - 1) + numTrees(n - i);
			} else {
				sum += (numTrees(i - 1) * numTrees(n - i));
			}
		}
		return sum;
	}

	/**
	 * Problem 100
	 * 
	 * @param p
	 * @param q
	 * @return whether q and p are the same
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (p == null && q == null) {
			return true;
		}
		if (p == null && q != null) {
			return false;
		}
		if (q == null && p != null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	/**
	 * Problem 101
	 * 
	 * @param root
	 * @return whether tree at root is symmetric
	 */
	public boolean isSymmetric(TreeNode root) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (root == null) {
			return true;
		}
		return isMirror(root.left, root.right);
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if ((t1 == null && t2 != null) || (t1 != null && t2 == null)) {
			return false;
		}
		if (t1.val == t2.val) {
			return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
		} else {
			return false;
		}
	}

	/**
	 * Problem 102
	 * 
	 * @param root
	 * @return level order traversal of tree at root
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int level = 1;
		int newLevel = 0;
		List<Integer> element = new ArrayList<>();
		while (queue.size() > 0) {
			TreeNode node = queue.poll();
			if (node.left != null) {
				queue.offer(node.left);
				newLevel++;
			}
			if (node.right != null) {
				queue.offer(node.right);
				newLevel++;
			}
			element.add(node.val);
			level--;
			if (level == 0) {
				res.add(element);
				element = new ArrayList<>();
				level = newLevel;
				newLevel = 0;
			}

		}
		return res;
	}

	/**
	 * Problem 103
	 * 
	 * @param root
	 * @return zigzag pattern of lever order traversal of tree at root
	 */
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int level = 1;
		int newLevel = 0;
		boolean fromLeft = true;
		List<Integer> element = new ArrayList<>();
		while (queue.size() > 0) {
			TreeNode node = queue.poll();

			if (node.left != null) {
				queue.offer(node.left);
				newLevel++;
			}
			if (node.right != null) {
				queue.offer(node.right);
				newLevel++;
			}

			if (fromLeft) {
				element.add(node.val);
			} else {
				element.add(0, node.val);
			}

			level--;
			if (level == 0) {
				res.add(element);
				element = new ArrayList<>();
				level = newLevel;
				newLevel = 0;
				fromLeft = !fromLeft;
			}

		}
		return res;
	}

	/**
	 * Problem 104
	 * 
	 * @param root
	 * @return max depth of tree at root
	 */
	public int maxDepth(TreeNode root) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (root == null) {
			return 0;
		}
		int leftMax = maxDepth(root.left);
		int rightMax = maxDepth(root.right);
		if (leftMax > rightMax) {
			return leftMax + 1;
		} else {
			return rightMax + 1;
		}
	}

	/**
	 * Problem 116
	 * 
	 * @param root
	 *            Populate each next pointer to point to its next right node. If
	 *            there is no next right node, the next pointer should be set to
	 *            NULL.
	 * 
	 *            Initially, all next pointers are set to NULL.
	 */
	public void connect(TreeLinkNode root) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		if (root != null) {
			queue.add(root);
		}
		int i = 1;
		while (!queue.isEmpty()) {
			int k = i;
			TreeLinkNode pre = queue.remove(0);
			if (i == 1) {
				if (pre.left != null) {
					queue.add(pre.left);
					queue.add(pre.right);
				}
				i *= 2;
				continue;
			}
			while (k-- > 1) {
				TreeLinkNode post = queue.remove(0);
				if (k % 2 == 1) {
					if (pre.left != null) {
						queue.add(pre.left);
						queue.add(pre.right);
					}
					if (post.left != null) {
						queue.add(post.left);
						queue.add(post.right);
					}
				}
				pre.next = post;
				pre = post;
			}
			i *= 2;
		}

	}

	/**
	 * Problem 122
	 * 
	 * @param prices
	 * @return max profit with stock prices
	 */
	public int maxProfit(int[] prices) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (prices == null || prices.length == 0 || prices.length == 1) {
			return 0;
		}
		int profit = 0;
		boolean buy = false;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1] && buy == false) {
				profit -= prices[i];
				buy = true;
			}
			if (buy == true && prices[i] > prices[i + 1]) {
				profit += prices[i];
				buy = false;
			}
			if (buy == true && i == prices.length - 2) {
				profit += prices[i + 1];
				buy = false;
			}
		}
		if (profit <= 0) {
			return 0;
		}
		return profit;
	}

	/**
	 * Problem 136
	 * 
	 * @param A
	 * @return Given an array of integers, every element appears two times
	 *         except for one. Find that single one.
	 */
	public int singleNumber(int[] A) {
		if (A.length == 0)
			return 0;
		int res = A[0];
		for (int i = 1; i < A.length; i++) {
			res ^= A[i];
		}
		return res;
	}

	/**
	 * Problem 137
	 * 
	 * @param A
	 * @return Given an array of integers, every element appears three times
	 *         except for one. Find that single one.
	 */
	public int singleNumberII(int[] A) {
		int ones = 0, twos = 0, threes = 0;
		for (int i = 0; i < A.length; i++) {
			twos |= ones & A[i];
			ones ^= A[i];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes;
		}
		return ones;
	}

	/**
	 * Problem 141
	 * 
	 * @param head
	 * @return whether ListNode at head has a cycle
	 */
	public boolean hasCycle(ListNode head) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	/**
	 * problem 144
	 * 
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root != null) {
			res.add(root.val);
			res.addAll(preorderTraversal(root.left));
			res.addAll(preorderTraversal(root.right));
		}
		return res;
	}

	/**
	 * Problem 169
	 * 
	 * @param nums
	 * @return majority element
	 */
	public int majorityElement(int[] nums) {
		int candinate = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				count = 1;
				candinate = nums[i];
			} else {
				if (candinate == nums[i]) {
					count++;
				} else {
					count--;
				}
			}
		}
		return candinate;
	}

	/**
	 * Problem 171
	 * 
	 * @param s
	 * @return corresponding column number of column title s
	 */
	public int titleToNumber(String s) {
		int length = s.length();
		int base = 26;
		int factor = 1;
		int sum = 0;
		for (int i = length - 1; i >= 0; i--) {
			int c = s.charAt(i) - 64;
			sum += factor * c;
			factor *= base;
		}
		return sum;
	}

	/**
	 * Problem 191
	 * 
	 * @param n
	 * @return number of 1 bits in n
	 */
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		long number = n & 0x00000000ffffffffL;
		int count = 0;
		int res = 0;
		while (number > 0 && count < 32) {
			if ((number & 1) == 1) {
				res++;
			}
			count++;
			number = number >> 1;
		}
		return res;
	}

	/**
	 * Problem 201
	 * 
	 * @param m
	 * @param n
	 * @return the bitwise AND of all numbers in this range, inclusive.
	 */
	public int rangeBitwiseAnd(int m, int n) {
		if (m == n)
			return m;
		int factor = 1;
		int sum = 0;
		while (n != 0) {
			if ((m & 1) == 1 && (n & 1) == 1) {
				sum += factor;
			} else if ((m & 1) == 0 && (n & 1) == 0) {

			} else {
				sum = 0;
			}
			m >>= 1;
			n >>= 1;
			factor *= 2;
		}
		return sum;
	}

	/**
	 * Problem 203
	 * 
	 * @param head
	 * @param val
	 * @return ListNode at head without node of value val
	 */
	public ListNode removeElements(ListNode head, int val) {
		while (head != null) {
			if (head.val == val) {
				head = head.next;
			} else {
				break;
			}
		}
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head.next;
		ListNode post = head;
		while (pre != null) {
			if (pre.val == val) {
				post.next = pre.next;
			} else {
				post = pre;
			}
			pre = pre.next;
		}
		return head;
	}

	/**
	 * Problem 204
	 * 
	 * @param n
	 * @return number of primes less than n
	 */
	public int countPrimes(int n) {
		if (n <= 2)
			return 0;
		int[] nums = new int[n];
		nums[0] = 0;
		nums[1] = 0;
		for (int i = 2; i < nums.length; i++) {
			nums[i] = 1;
		}
		for (int j = 2; j < Math.sqrt(nums.length); j++) {
			if (nums[j] == 1) {
				for (int k = j * j; k < nums.length; k += j) {
					nums[k] = 0;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				count++;
		}
		return count;
	}

	/**
	 * Problem 205
	 * 
	 * @param s
	 * @param t
	 * @return whether s and t are isomorphic
	 */
	public boolean isIsomorphic(String s, String t) {
		if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;
		Map<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) != t.charAt(i)) {
					return false;
				}
			} else if (map.containsValue(t.charAt(i))) {
				return false;
			} else {
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

	/**
	 * Problem 206
	 * 
	 * @param head
	 * @return reverse ListNode of head
	 */
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode first = head;
		ListNode second = head.next;
		ListNode tmp = null;
		while (second != null) {
			tmp = second.next;
			second.next = head;
			first.next = tmp;
			head = second;
			second = tmp;
		}
		return head;
	}
}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
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