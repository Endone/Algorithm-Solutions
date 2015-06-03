package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		// System.out.println(new Solution().removeDuplicates(new int[] { 1, 2,
		// 2,
		// 2, 3, 3, 3, 4, 5, 6 }));
		// System.out.println(new Solution().strStr("aaab", "ab"));
		// System.out.println(new Solution().divide(1000, -11));
		// System.out.println(new Solution().generateParenthesis(5));
		// System.out.println(new Solution().mySqrt(2147395599));
		// System.out.println(new Solution().isHappy(41));
		// System.out.println(new Solution().rob(new int[] { 1, 20, 3, 19, 20,
		// 10,
		// 40 }));
		// System.out.println(new Solution().containsNearbyAlmostDuplicate(
		// new int[] { 0, 10, 22, 15, 0, 5, 22, 12, 1, 5 }, 3, 3));
		// System.out.println(new Solution().maximalSquare(new char[][] {
		// new char[] { '1', '1', '1', '1', '1' },
		// new char[] { '1', '0', '1', '0', '1' },
		// new char[] { '1', '1', '1', '1', '1' },
		// new char[] { '1', '0', '0', '1', '1' } }));
		// for (int i : new Solution().plusOne(new int[] { 9, 2, 9 }))
		// System.out.println(i);
		// System.out.println(new Solution().longestCommonPrefix(new String[] {
		// "123", "1234" }));
		// Solution tmpSolution = new Solution();
		// MinStack stack = tmpSolution.new MinStack();
		// stack.push(2147483646);
		// stack.push(2147483646);
		// stack.push(2147483647);
		// System.out.println(stack.top());
		// stack.pop();
		// System.out.println(stack.getMin());
		// stack.pop();
		// stack.getMin();
		// stack.pop();
		// stack.push(2147483647);
		// stack.top();
		// stack.getMin();
		// stack.push(-2147483648);
		// stack.top();
		// stack.getMin();
		// stack.pop();
		// stack.getMin();
		// System.out
		// .println(new Solution()
		// .isPalindrome("Damosel, a poem? A carol? Or a cameo pale? (So mad!)"));
		System.out.println(new Solution().convertToTitle(53));
	}

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
	 * Problem 8
	 * 
	 * @param str
	 * @return int value of str
	 */
	public int myAtoi(String str) {
		if (str == null)
			return 0;
		str = str.trim();
		if (str.length() == 0)
			return 0;
		StringBuilder builder = new StringBuilder();
		int start = 0;
		if (str.charAt(0) == '-') {
			builder.append('-');
			start = 1;
		}
		if (str.charAt(0) == '+')
			start = 1;
		for (int i = start; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				builder.append(str.charAt(i));
			} else {
				break;
			}
		}
		try {
			if (builder.toString().length() > 11) {
				return builder.toString().charAt(0) == '-' ? Integer.MIN_VALUE
						: Integer.MAX_VALUE;
			}
			long test = Long.parseLong(builder.toString());
			if (test >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (test <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			return Integer.parseInt(builder.toString());
		} catch (Exception e) {
			return 0;
		}
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
	 * Problem 14 Longest Common Prefix -- Write a function to find the longest
	 * common prefix string amongst an array of strings.
	 * 
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs == null)
			return null;
		if (strs.length == 0)
			return "";
		String common = strs[0];
		for (String val : strs) {
			int i = 0;
			for (; i < val.length() && i < common.length(); i++) {
				if (val.charAt(i) != common.charAt(i)) {
					break;
				}
			}
			common = common.substring(0, i);
		}
		return common;
	}

	/**
	 * Problem 19
	 * 
	 * @param head
	 * @param n
	 * @return list head without nth node from end
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = head;
		ListNode post = head;
		while (n-- > 0) {
			pre = pre.next;
		}
		if (pre == null) {
			head = head.next;
			return head;
		}
		while (pre.next != null) {
			pre = pre.next;
			post = post.next;
		}
		post.next = post.next.next;
		return head;
	}

	/**
	 * Problem 20
	 * 
	 * @param s
	 * @return whether s is valid
	 */
	public boolean isValid(String s) {
		int[] chars = new int[s.length()];
		int size = 0;
		for (int i = 0; i < s.length(); i++) {
			if (size == 0) {
				size++;
				chars[size - 1] = s.charAt(i);
			} else if (chars[size - 1] == 40 && s.charAt(i) == 41
					|| chars[size - 1] == 91 && s.charAt(i) == 93
					|| chars[size - 1] == 123 && s.charAt(i) == 125) {
				size--;
			} else {
				size++;
				chars[size - 1] = s.charAt(i);
			}
		}
		if (size == 0)
			return true;
		return false;
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
	 * Problem 22
	 * 
	 * @param n
	 * @return valid parenthesis string list
	 */
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		if (n == 0)
			return res;
		res.add("()");
		int size = 1;
		for (int i = 1; i < n; i++) {
			int round = 0;
			while (size-- != 0) {
				String val = res.remove(size);
				String middle = "(" + val + ")";
				String right = "()" + val;
				String left = val + "()";
				if (val.equals("(()())()")) {
					System.out.println(val);
				}
				int startIndex = 0;
				while (true) {
					startIndex = val.indexOf(")(", startIndex + 1);
					if (startIndex == -1)
						break;
					if (startIndex % 2 == 1) {
						int index = startIndex + 1;
						String pre = val.substring(0, index);
						String post = val.substring(index);
						if (!res.contains("(" + pre + ")" + post)) {
							res.add("(" + pre + ")" + post);
							round++;
						}
						if (!res.contains(pre + "(" + post + ")")) {
							res.add(pre + "(" + post + ")");
							round++;
						}
					}
				}
				if (!res.contains(middle)) {
					res.add(middle);
					round++;
				}
				if (!res.contains(right)) {
					res.add(right);
					round++;
				}
				if (!res.contains(left)) {
					res.add(left);
					round++;
				}
			}
			size = round;
		}
		return res;
	}

	/**
	 * Problem 26
	 * 
	 * @param A
	 * @return the length of A without duplicate value
	 */
	public int removeDuplicates(int[] A) {
		if (A == null) {
			return -1;
		}
		if (A.length < 2) {
			return A.length;
		}
		int length = A.length;
		for (int i = 0; i < length - 1; i++) {
			int runLength = 1;
			if (A[i] == A[i + 1]) {
				while (i + runLength < length - 1
						&& A[i + runLength] == A[i + runLength + 1]) {
					runLength++;
				}
				System.arraycopy(A, i + runLength, A, i, length - i - runLength);
				length -= runLength;
			}
		}
		return length;
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
	 * Problem 28
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;
		if (needle.equals(""))
			return 0;
		int lengthH = haystack.length();
		int lengthN = needle.length();
		for (int i = 0; i < lengthH - lengthN + 1; i++) {
			int j = 0;
			for (; j < lengthN; j++) {
				if (needle.charAt(j) != haystack.charAt(i + j)) {
					break;
				}
			}
			if (j == lengthN)
				return i;
		}
		return -1;
	}

	/**
	 * Problem 29
	 * 
	 * @param dividend
	 * @param divisor
	 * @return Divide two integers without using multiplication, division and
	 *         mod operator. If it is overflow, return MAX_INT.
	 */
	public int divide(int dividend, int divisor) {
		boolean flag = true;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			flag = false;
		}
		long dividend1 = Math.abs((long) dividend);
		long divisor1 = Math.abs((long) divisor);
		long l = 0;
		long r = dividend1;

		while (l <= r) {
			long mid = ((r - l) >> 1) + l;
			if (divisor1 * mid > dividend1) {
				r = mid - 1;
			} else if ((dividend1 - divisor1 * mid < divisor1)) {
				l = mid;
				break;
			} else {
				l = mid + 1;
			}
		}
		if (flag) {
			if (l > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else {
				return (int) l;
			}
		} else {
			if (l < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			else {
				return (int) -l;
			}
		}
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
	 * Problem 58 Length of Last Word -- Given a string s consists of
	 * upper/lower-case alphabets and empty space characters ' ', return the
	 * length of last word in the string.
	 * 
	 * If the last word does not exist, return 0.
	 * 
	 * Note: A word is defined as a character sequence consists of non-space
	 * characters only.
	 * 
	 * For example, Given s = "Hello World", return 5.
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLastWord(String s) {
		if (s == null)
			return 0;
		String[] parts = s.split(" ");
		if (parts.length == 0)
			return 0;
		return parts[parts.length - 1].length();
	}

	/**
	 * Problem 66 Plus One -- Given a non-negative number represented as an
	 * array of digits, plus one to the number.
	 * 
	 * The digits are stored such that the most significant digit is at the head
	 * of the list.
	 * 
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0)
			return digits;
		int plus = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + plus;
			if (sum < 10) {
				digits[i] = digits[i] + 1;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		System.arraycopy(digits, 0, res, 1, digits.length);
		return res;
	}

	/**
	 * Problem 69
	 * 
	 * @param x
	 * @return square root of x
	 */
	public int mySqrt(int x) {
		if (x < 0)
			throw new IllegalArgumentException();
		if (x == 0)
			return 0;
		if (x < 4)
			return 1;
		int left = 2;
		int right = x / 2;
		while (left <= right) {
			int mid = (left + right) / 2;
			long power = (long) mid * (long) mid;
			if (power == x)
				return mid;
			else if (power > x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left - 1;
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
	 * Problem 112 Path Sum -- Given a binary tree and a sum, determine if the
	 * tree has a root-to-leaf path such that adding up all the values along the
	 * path equals the given sum.
	 * 
	 * @param root
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		if (sum == root.val && root.left == null && root.right == null) {
			return true;
		}
		sum -= root.val;
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
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
	 * Problem 125 Valid Palindrome -- Given a string, determine if it is a
	 * palindrome, considering only alphanumeric characters and ignoring cases.
	 * 
	 * For example, "A man, a plan, a canal: Panama" is a palindrome.
	 * "race a car" is not a palindrome.
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {
		if (s == null)
			return false;
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
		int length = s.length();
		for (int i = 0; i < length / 2; i++) {
			if (s.charAt(i) != s.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
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
	 * Problem 155 Min Stack -- Design a stack that supports push, pop, top, and
	 * retrieving the minimum element in constant time.
	 * 
	 * push(x) -- Push element x onto stack. pop() -- Removes the element on top
	 * of the stack. top() -- Get the top element. getMin() -- Retrieve the
	 * minimum element in the stack.
	 * 
	 * @author Administrator
	 * 
	 */
	class MinStack {
		private Stack<Integer> items;
		private Stack<Integer> index;

		public void push(int x) {
			if (items == null) {
				items = new Stack<>();
				index = new Stack<>();
				index.push(0);
			} else if (!items.isEmpty()) {
				if (items.get(index.peek()) > x) {
					index.push(items.size());
				} else {
					index.push(index.peek());
				}
			} else {
				index.push(0);
			}
			items.add(x);
		}

		public void pop() {
			if (items != null && !items.isEmpty()) {
				items.pop();
				index.pop();
			}
		}

		public int top() {
			if (items != null && !items.isEmpty()) {
				return items.peek();
			}
			return -1;
		}

		public int getMin() {
			if (items != null && !items.isEmpty()) {
				return items.get(index.peek());
			}
			return -1;
		}
	}

	/**
	 * Problem 168 Excel Sheet Column Title -- Given a positive integer, return
	 * its corresponding column title as appear in an Excel sheet.
	 * 
	 * @param n
	 * @return
	 */
	public String convertToTitle(int n) {
		if (n <= 0) {
			return "";
		}
		StringBuffer buffer = new StringBuffer();
		while (n > 0) {
			int tmp = n % 26;
			if (tmp == 0) {
				n--;
				tmp = 26;
			}
			char c = (char) (tmp + 64);
			n = n / 26;
			buffer.append(c);
		}
		return new String(buffer.reverse());

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
	 * Problem 189 Rotate Array -- Rotate an array of n elements to the right by
	 * k steps.
	 * 
	 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated
	 * to [5,6,7,1,2,3,4].
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate1(int[] nums, int k) {
		for (int i = nums.length - k; i < nums.length; i++) {
			int tmp = nums[i];
			int count = 0;
			int j = i;
			for (; count < nums.length - k; j--) {
				nums[j] = nums[j - 1];
				count++;
			}
			nums[j] = tmp;
		}
	}

	public void rotate2(int[] nums, int k) {
		if (k >= nums.length)
			return;
		int[] tmp = new int[nums.length - k];
		System.arraycopy(nums, 0, tmp, 0, nums.length - k);
		System.arraycopy(nums, nums.length - k, nums, 0, k);
		System.arraycopy(tmp, 0, nums, k, nums.length - k);
	}

	/**
	 * Problem 190 Reverse Bits -- Reverse bits of a given 32 bits unsigned
	 * integer.
	 * 
	 * For example, given input 43261596 (represented in binary as
	 * 00000010100101000001111010011100), return 964176192 (represented in
	 * binary as 00111001011110000010100101000000).
	 * 
	 * @param n
	 * @return
	 */
	// you need treat n as an unsigned values
	public int reverseBits(int n) {
		int res = 0;
		int count = 31;
		while (count >= 0) {
			int tmp = n & 1;
			if (tmp == 1) {
				res |= (1 << count);
			}
			n >>= 1;
			count -= 1;
		}
		return res;
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
	 * Problem 198 House Robber
	 * 
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int length = nums.length;
		int back = 0;
		List<Integer> sums = new ArrayList<>();
		sums.add(nums[0]);
		int max = 0;
		for (int i = 1; i < length; i++) {
			int tmp = sums.size();
			sums.add(nums[i]);
			for (int j = 0; j < back; j++) {
				int val = nums[i] + sums.get(j);
				sums.add(val);
				if (val > max)
					max = val;
			}
			back = tmp;
		}
		return max;
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
	 * Problem 202
	 * 
	 * @param n
	 * @return
	 */
	public boolean isHappy(int n) {
		int sum = squaresOfDigits(n);
		Set<Integer> set = new HashSet<>();
		set.add(sum);
		while (sum != 1) {
			sum = squaresOfDigits(sum);
			if (set.contains(sum))
				return false;
			else
				set.add(sum);
		}
		return true;
	}

	public int squaresOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int tmp = num % 10;
			sum += tmp * tmp;
			num /= 10;
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

	/**
	 * Problem 217 Contains Duplicate
	 * 
	 * @param nums
	 * @return true if nums contains duplicate, false otherwise
	 */
	public boolean containsDuplicate(int[] nums) {
		if (nums == null)
			return true;
		Set<Integer> set = new HashSet<>();
		for (int val : nums) {
			if (set.contains(val))
				return true;
			else
				set.add(val);
		}
		return false;
	}

	/**
	 * Problem 219 Contains Duplicate II -- Given an array of integers and an
	 * integer k, find out whether there there are two distinct indices i and j
	 * in the array such that nums[i] = nums[j] and the difference between i and
	 * j is at most k.
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int val = map.get(nums[i]);
				if (i - val <= k)
					return true;
				else
					map.put(nums[i], i);
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

	/**
	 * Problem 220 Contains Duplicate III -- Given an array of integers, find
	 * out whether there are two distinct indices i and j in the array such that
	 * the difference between nums[i] and nums[j] is at most t and the
	 * difference between i and j is at most k.
	 * 
	 * @param nums
	 * @param k
	 * @param t
	 * @return
	 */
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums == null || nums.length <= 1 || k == 0)
			return false;
		int[] tmp = new int[nums.length - 1];
		for (int i = 0; i < nums.length - 1; i++) {
			tmp[i] = nums[i + 1] - nums[i];
		}
		int diff = tmp[0];
		int count = 1;
		int start = 0;
		for (int i = 1; i < tmp.length; i++) {
			if (Math.abs(diff) <= t)
				return true;
			else {
				if (Math.abs(tmp[i]) <= t)
					return true;
				diff += tmp[i];
				count++;
				if (count == k + 1) {
					diff -= tmp[start];
					start++;
					count--;
				}
			}
		}
		if (Math.abs(diff) <= t && Math.abs(diff) >= 0)// for overflow
			return true;
		return false;
	}

	/**
	 * Problem 221 Maximal Square -- Given a 2D binary matrix filled with 0's
	 * and 1's, find the largest square containing all 1's and return its area.
	 * 
	 * @param matrix
	 * @return
	 */
	public int maximalSquare(char[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int length = matrix.length;
		int length2 = matrix[0].length;
		int max = 0;
		int[][] sq = new int[length][length2];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length2; j++) {
				if (matrix[i][j] == '0') {
					sq[i][j] = 0;
				} else {
					if (i == 0 || j == 0) {
						sq[i][j] = 1;
					} else if (sq[i - 1][j] > 0 && sq[i][j - 1] > 0) {
						if (sq[i - 1][j] == sq[i][j - 1]) {
							int tmp = sq[i - 1][j];
							if (matrix[i - tmp][j - tmp] == '1')
								sq[i][j] = tmp + 1;
							else {
								sq[i][j] = tmp;
							}
						} else {
							int tmp = Math.min(sq[i - 1][j], sq[i][j - 1]);
							sq[i][j] = tmp + 1;
						}
					} else {
						sq[i][j] = 1;
					}
				}
				if (max < sq[i][j]) {
					max = sq[i][j];
				}
			}
		}
		return max * max;
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