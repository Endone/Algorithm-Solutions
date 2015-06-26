package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

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
		// System.out.println(new Solution().convertToTitle(53));
		// System.out.println(new Solution().trailingZeroes(1808548329));
		// System.out.println(new Solution().compareVersion("1.0", "1"));
		// System.out.println(new Solution().getRow(1));
		// ListNode head = new ListNode(1);
		// ListNode node1 = new ListNode(2);
		// ListNode node2 = new ListNode(3);
		// ListNode node3 = new ListNode(4);
		// ListNode node4 = new ListNode(5);
		// ListNode node5 = new ListNode(6);
		// ListNode node6 = new ListNode(7);
		// ListNode node7 = new ListNode(8);
		// ListNode node8 = new ListNode(9);
		// head.next = node1;
		// node1.next = node2;
		// node2.next = node3;
		// node3.next = node4;
		// node4.next = node5;
		// node5.next = node6;
		// node6.next = node7;
		// node7.next = node8;
		// head = new Solution().reverseKGroup(head, 2);
		// while (head != null) {
		// System.out.println(head.val);
		// head = head.next;
		// }
		// System.out.println(new Solution().convert("PAYPALISHIRING", 5));
		// System.out.println(new Solution().isPalindrome(-2147483648));
		// System.out.println(new Solution().addBinary("11", "1"));
		// System.out.println(new Solution().countAndSay(5));
		// System.out.println(new Solution().isValidSudoku(new char[][] {
		// ".87654321".toCharArray(), "2........".toCharArray(),
		// "3........".toCharArray(), "4........".toCharArray(),
		// "5........".toCharArray(), "6........".toCharArray(),
		// "7........".toCharArray(), "8........".toCharArray(),
		// "9........".toCharArray() }));
		// System.out.println(new Solution().findMin(new int[] { 3, 4, 5, 6, 7,
		// 0,
		// 1, 2 }));
		// System.out.println(new Solution().maxProduct(new int[] { -4, -3, -2
		// }));
		// System.out.println(new Solution().intToRoman(1666));
		// System.out.println(new Solution().canJump(new int[] { 2, 2, 1, 0, 4
		// }));
		// System.out.println(new Solution().numIslands(new char[][] {
		// "10111".toCharArray(), "10101".toCharArray(),
		// "11101".toCharArray() }));
		// TreeNode root = new TreeNode(6);
		// TreeNode node2 = new TreeNode(1);
		// TreeNode node3 = new TreeNode(3);
		// TreeNode node4 = new TreeNode(2);
		// TreeNode node5 = new TreeNode(5);
		// TreeNode node6 = new TreeNode(4);
		// root.left = node2;
		// node2.right = node3;
		// node3.left = node4;
		// node3.right = node5;
		// node5.left = node6;
		// System.out.println(new Solution().rightSideViewSimple(root));
		// System.out
		// .println(new Solution().computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
		// MyStack stack = new MyStack();
		// stack.push(1);
		// stack.push(2);
		// System.out.println(stack.top());
		// System.out.println(stack.empty());
		// stack.pop();
		// System.out.println(stack.top());
		// stack.pop();
		// System.out.println(stack.empty());
		// System.out.println(new Solution().canFinishWithStack(5, new int[][] {
		// new int[] { 0, 2 }, new int[] { 1, 2 }, new int[] { 2, 3 },
		// new int[] { 2, 4 }, new int[] { 3, 4 } }));
		// System.out.println(new Solution().canFinishWithStack(2, new int[][] {
		// new int[] { 0, 1 }, new int[] { 1, 0 } }));
		// System.out.println(new Solution().canFinishWithStack(10, new int[][]
		// {
		// new int[] { 5, 8 }, new int[] { 3, 5 }, new int[] { 1, 9 },
		// new int[] { 4, 5 }, new int[] { 0, 2 }, new int[] { 1, 9 },
		// new int[] { 7, 8 }, new int[] { 4, 9 } }));
		// System.out.println(new Solution().canFinishWithRecurence(5,
		// new int[][] { new int[] { 0, 2 }, new int[] { 1, 2 },
		// new int[] { 2, 3 }, new int[] { 2, 4 },
		// new int[] { 3, 4 } }));
		// System.out.println(new Solution().canFinishWithRecurence(2,
		// new int[][] { new int[] { 0, 1 }, new int[] { 1, 0 } }));
		// System.out.println(new Solution().canFinishWithRecurence(10,
		// new int[][] { new int[] { 5, 8 }, new int[] { 3, 5 },
		// new int[] { 1, 9 }, new int[] { 4, 5 },
		// new int[] { 0, 2 }, new int[] { 1, 9 },
		// new int[] { 7, 8 }, new int[] { 4, 9 } }));
		// System.out.println(new Solution().canFinishWithIndegree(5, new
		// int[][] {
		// new int[] { 0, 2 }, new int[] { 1, 2 }, new int[] { 2, 3 },
		// new int[] { 2, 4 }, new int[] { 3, 4 } }));
		// System.out.println(new Solution().canFinishWithIndegree(2, new
		// int[][] {
		// new int[] { 0, 1 }, new int[] { 1, 0 } }));
		// System.out.println(new Solution().canFinishWithIndegree(10,
		// new int[][] { new int[] { 5, 8 }, new int[] { 3, 5 },
		// new int[] { 1, 9 }, new int[] { 4, 5 },
		// new int[] { 0, 2 }, new int[] { 1, 9 },
		// new int[] { 7, 8 }, new int[] { 4, 9 } }));
		// System.out.println(new Solution().summaryRanges(new int[] { 0, 1, 2,
		// 4,
		// 5, 6, 8, 9, 11, 13, 15, 16, 17 }));
		// System.out.println(new Solution().calculate("(1+(4+5+2)-3)-(6+8)"));
		// System.out.println(new Solution().calculate2("3*2*2/4/2*3"));
		System.out.println(new Solution().calculate2(" 3+5 / 2 "));
	}

	/**
	 * Problem 1 Two Sum -- Given an array of integers, find two numbers such
	 * that they add up to a specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that
	 * they add up to the target, where index1 must be less than index2. Please
	 * note that your returned answers (both index1 and index2) are not
	 * zero-based.
	 * 
	 * You may assume that each input would have exactly one solution.
	 * 
	 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
	 * 
	 * @param numbers
	 * @param target
	 * @return two index whose sum equals to target
	 * @idea HashTable
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
	 * problem 6 ZigZag Conversion -- The string "PAYPALISHIRING" is written in
	 * a zigzag pattern on a given number of rows like this: (you may want to
	 * display this pattern in a fixed font for better legibility)
	 * 
	 * P A H N A P L S I I G Y I R And then read line by line: "PAHNAPLSIIGYIR"
	 * Write the code that will take a string and make this conversion given a
	 * number of rows:
	 * 
	 * string convert(string text, int nRows); convert("PAYPALISHIRING", 3)
	 * should return "PAHNAPLSIIGYIR".
	 * 
	 * @param s
	 *            https://leetcode.com/problems/zigzag-conversion/
	 * @param numRows
	 * @return zigzag pattern of s
	 */
	public String convert(String s, int numRows) {
		if (s == null)
			return null;
		if (numRows == 1)
			return s;
		int step = 2 * numRows - 2;
		int tmp = step;
		StringBuffer buffer = new StringBuffer();
		for (int j = 0; j < numRows; j++) {
			int swi = tmp;
			boolean sw = false;
			for (int i = j; i < s.length();) {
				char c = s.charAt(i);
				buffer.append(c);
				if (j > 0 && j < numRows - 1) {
					if (sw) {
						swi = step - swi;
					} else {
						sw = true;
					}
				}
				i += swi;
			}
			tmp -= 2;
			if (tmp == 0)
				tmp = step;
		}
		return new String(buffer);
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
	 * Problem 9 Palindrome Number -- Determine whether an integer is a
	 * palindrome. Do this without extra space.
	 * 
	 * click to show spoilers.
	 * 
	 * Some hints: Could negative integers be palindromes? (ie, -1)
	 * 
	 * If you are thinking of converting the integer to string, note the
	 * restriction of using extra space.
	 * 
	 * You could also try reversing an integer. However, if you have solved the
	 * problem "Reverse Integer", you know that the reversed integer might
	 * overflow. How would you handle such case?
	 * 
	 * There is a more generic way of solving this problem.
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if (x == Integer.MIN_VALUE)
			return false;
		if (x < 0)
			x = -x;
		int length = 1;
		int tmp = x;
		int topFactor = 1;
		int botFactor = 10;
		while (tmp >= 10) {
			tmp /= 10;
			length++;
			topFactor *= 10;
		}
		if (length <= 1)
			return true;
		while (topFactor > 1) {
			if (x / topFactor != x % botFactor)
				return false;
			x %= topFactor;
			x /= botFactor;
			topFactor /= 100;
		}
		return true;
	}

	/**
	 * Problem 12 Integer to Roman -- Given an integer, convert it to a Roman
	 * numeral.
	 * 
	 * Input is guaranteed to be within the range from 1 to 3999.
	 * 
	 * @param num
	 * @return
	 */
	public String intToRoman(int num) {
		int count = 1;
		StringBuffer buffer = new StringBuffer();
		while (num > 0) {
			int remainder = num % 10;
			num /= 10;
			if (remainder == 9) {
				switch (count) {
				case 1:
					buffer.append("XI");
					break;
				case 2:
					buffer.append("CX");
					break;
				case 3:
					buffer.append("MC");
					break;
				default:
					break;
				}
			} else if (remainder == 4) {
				switch (count) {
				case 1:
					buffer.append("VI");
					break;
				case 2:
					buffer.append("LX");
					break;
				case 3:
					buffer.append("DC");
					break;
				default:
					break;
				}
			} else if (remainder == 5) {
				switch (count) {
				case 1:
					buffer.append("V");
					break;
				case 2:
					buffer.append("L");
					break;
				case 3:
					buffer.append("D");
					break;
				default:
					break;
				}
			} else if (remainder > 0 && remainder < 4) {
				for (int j = 0; j < remainder; j++) {
					switch (count) {
					case 1:
						buffer.append("I");
						break;
					case 2:
						buffer.append("X");
						break;
					case 3:
						buffer.append("C");
						break;
					case 4:
						buffer.append("M");
						break;
					default:
						break;
					}
				}
			} else if (remainder > 5 && remainder < 9) {
				for (int j = 0; j < remainder % 5; j++) {
					switch (count) {
					case 1:
						buffer.append("I");
						break;
					case 2:
						buffer.append("X");
						break;
					case 3:
						buffer.append("C");
						break;
					default:
						break;
					}
				}
				switch (count) {
				case 1:
					buffer.append("V");
					break;
				case 2:
					buffer.append("L");
					break;
				case 3:
					buffer.append("D");
					break;
				default:
					break;
				}
			}
			count++;
		}
		return new String(buffer.reverse());
	}

	/**
	 * Problem 13 Roman to Integer -- Given a Roman numeral, convert it to an
	 * integer.
	 * 
	 * Input is guaranteed to be within the range from 1 to 3999.
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
	 * Problem 25 Reverse Nodes in k-Group -- Given a linked list, reverse the
	 * nodes of a linked list k at a time and return its modified list.
	 * 
	 * If the number of nodes is not a multiple of k then left-out nodes in the
	 * end should remain as it is.
	 * 
	 * You may not alter the values in the nodes, only nodes itself may be
	 * changed.
	 * 
	 * Only constant memory is allowed.
	 * 
	 * For example, Given this linked list: 1->2->3->4->5
	 * 
	 * For k = 2, you should return: 2->1->4->3->5
	 * 
	 * For k = 3, you should return: 3->2->1->4->5
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null)
			return null;
		ListNode end = head;// mark the end of one round reverse
		ListNode pre = head;
		ListNode post = head;
		ListNode connector = null;// to connect different parts of reverse
		int count = 0;
		while (true) {
			int tmp = k;
			while (tmp > 0 && end != null) {
				end = end.next;
				tmp--;
			}
			if (tmp > 0)
				return head;
			ListNode node = null;
			while (pre.next != end) {
				node = pre.next;
				pre.next = pre.next.next;
				node.next = post;
				post = node;
			}
			if (count == 0)
				head = post;
			else
				connector.next = post;
			connector = pre;
			post = end;
			pre = end;
			count++;
		}
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
	 * Problem 36 Valid Sudoku -- Determine if a Sudoku is valid
	 * 
	 * @param board
	 * @return
	 */
	public boolean isValidSudoku(char[][] board) {
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.')
					if (set1.contains(board[i][j]))
						return false;
					else
						set1.add(board[i][j]);
				if (board[j][i] != '.')
					if (set2.contains(board[j][i]))
						return false;
					else
						set2.add(board[j][i]);
			}
			set1.clear();
			set2.clear();
		}
		for (int k = 0; k < 9; k++) {
			for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
				for (int j = (k % 3) * 3; j < (k % 3) * 3 + 3; j++) {
					if (board[i][j] != '.') {
						if (set1.contains(board[i][j]))
							return false;
						set1.add(board[i][j]);
					}
				}
			}
			set1.clear();
		}
		return true;
	}

	/**
	 * Problem 38 Count and Say -- The count-and-say sequence is the sequence of
	 * integers beginning as follows: 1, 11, 21, 1211, 111221, ...
	 * 
	 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is
	 * read off as "one 2, then one 1" or 1211. Given an integer n, generate the
	 * nth sequence.
	 * 
	 * Note: The sequence of integers will be represented as a string.
	 * 
	 * @param n
	 * @return
	 */
	public String countAndSay(int n) {
		if (n < 1)
			return "";
		String a = "1";

		for (int i = 1; i < n; i++) {
			StringBuffer buffer = new StringBuffer();
			int j = 0;
			int ai = a.charAt(j);
			int count = 1;
			for (j = 1; j < a.length(); j++) {
				if (a.charAt(j) == ai) {
					count++;
				} else {
					buffer.append(count);
					buffer.append(ai - 48);
					ai = a.charAt(j);
					count = 1;
				}
			}
			buffer.append(count);
			buffer.append(ai - 48);
			a = new String(buffer);
		}
		return a;
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
	 * Problem 55 Jump Game -- Given an array of non-negative integers, you are
	 * initially positioned at the first index of the array.
	 * 
	 * Each element in the array represents your maximum jump length at that
	 * position.
	 * 
	 * Determine if you are able to reach the last index.
	 * 
	 * For example: A = [2,3,1,1,4], return true.
	 * 
	 * A = [3,2,1,0,4], return false.
	 * 
	 * @param nums
	 * @return
	 */
	public boolean canJump(int[] nums) {
		if (nums.length < 2)
			return true;
		int distance = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] >= distance) {
				if (i == 0)
					return true;
				distance = 1;
			} else
				distance++;
		}
		return false;
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
	 * Problem 67 Add Binary -- Given two binary strings, return their sum (also
	 * a binary string).
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
		if (a == null)
			return b;
		if (b == null)
			return a;
		StringBuffer buffer = new StringBuffer();
		int al = a.length();
		int bl = b.length();
		int min = al > bl ? bl : al;
		int carry = 0;
		int i = 0;
		for (; i < min; i++) {
			int ai = a.charAt(al - 1 - i) - 48;
			int bi = b.charAt(bl - 1 - i) - 48;
			int tmp = ai + bi + carry;
			buffer.append(tmp % 2);
			carry = tmp / 2;
		}
		if (al > bl) {
			while (i < al) {
				int tmp = a.charAt(al - 1 - i) - 48 + carry;
				buffer.append(tmp % 2);
				carry = tmp / 2;
				i++;
			}
		} else {
			while (i < bl) {
				int tmp = b.charAt(bl - 1 - i) - 48 + carry;
				buffer.append(tmp % 2);
				carry = tmp / 2;
				i++;
			}
		}
		if (carry == 1) {
			buffer.append(1);
		}
		return new String(buffer.reverse());
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
	 * Problem 88 Merge Sorted Array -- Given two sorted integer arrays nums1
	 * and nums2, merge nums2 into nums1 as one sorted array.
	 * 
	 * Note: You may assume that nums1 has enough space (size that is greater or
	 * equal to m + n) to hold additional elements from nums2. The number of
	 * elements initialized in nums1 and nums2 are m and n respectively.
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//
		if (nums1 == null || nums2 == null || n == 0)
			return;
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
	}

	/**
	 * Problem 94
	 * 
	 * @param root
	 * @return in order traversal
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
	 * Problem 102 Binary Tree Level Order Traversal -- Given a binary tree,
	 * return the level order traversal of its nodes' values. (ie, from left to
	 * right, level by level).
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
	 * Problem 107 Binary Tree Level Order Traversal II -- Given a binary tree,
	 * return the bottom-up level order traversal of its nodes' values. (ie,
	 * from left to right, level by level from leaf to root).
	 * 
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
				res.add(0, element);
				element = new ArrayList<>();
				level = newLevel;
				newLevel = 0;
			}
		}
		return res;
	}

	/**
	 * Problem 110 Balanced Binary Tree -- Given a binary tree, determine if it
	 * is height-balanced.
	 * 
	 * For this problem, a height-balanced binary tree is defined as a binary
	 * tree in which the depth of the two subtrees of every node never differ by
	 * more than 1.
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		if (root.left != null && root.right != null)
			// right and left subtree depth difference within 1 and right and
			// left subtree be balanced
			return Math.abs(depth(root.left) - depth(root.right)) <= 1
					&& isBalanced(root.left) && isBalanced(root.right);
		if (root.left != null) {
			return depth(root.left) <= 1;
		}
		if (root.right != null)
			return depth(root.right) <= 1;
		return true;
	}

	public int depth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(depth(root.left), depth(root.right));
	}

	/**
	 * Problem 111 Minimum Depth of Binary Tree -- Given a binary tree, find its
	 * minimum depth.
	 * 
	 * The minimum depth is the number of nodes along the shortest path from the
	 * root node down to the nearest leaf node.
	 * 
	 * @param root
	 * @return
	 */
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left != null && root.right != null)
			return 1 + Math.min(minDepth(root.left), minDepth(root.right));
		if (root.left != null)
			return 1 + minDepth(root.left);
		if (root.right != null)
			return 1 + minDepth(root.right);
		return 0;
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
	 * Problem 118 Pascal's Triangle -- Given numRows, generate the first
	 * numRows of Pascal's triangle.
	 * 
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		if (numRows < 1) {
			return res;
		}
		List<Integer> tmp = new ArrayList<>();
		tmp.add(1);
		res.add(tmp);
		for (int i = 2; i <= numRows; i++) {
			tmp = res.get(res.size() - 1);
			List<Integer> element = new ArrayList<>();
			element.add(tmp.get(0));
			int j = 0;
			for (; j < tmp.size() - 1; j++) {
				element.add(tmp.get(j) + tmp.get(j + 1));
			}
			element.add(tmp.get(j));
			res.add(element);
		}
		return res;
	}

	/**
	 * Problem 119 Pascal's Triangle II -- Given an index k, return the kth row
	 * of the Pascal's triangle.
	 * 
	 * For example, given k = 3, Return [1,3,3,1].
	 * 
	 * @param rowIndex
	 * @return
	 */
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<>();
		res.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			int j = 0;
			int size = res.size();
			int tmp = res.get(j);// to remember the post one
			for (; j < size - 1; j++) {
				int pre = tmp;
				int post = res.get(j + 1);
				res.add(j + 1, pre + post);
				if (j + 2 < size)
					res.remove(j + 2);// remove added element
				tmp = post;
			}
			if (i == 1)
				res.add(1);
		}
		return res;
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
	 * Problem 151 Reverse Words in a String -- Given an input string, reverse
	 * the string word by word.
	 * 
	 * For example, Given s = "the sky is blue", return "blue is sky the".
	 * 
	 * Update (2015-02-12): For C programmers: Try to solve it in-place in O(1)
	 * space. Clarification: What constitutes a word? A sequence of non-space
	 * characters constitutes a word. Could the input string contain leading or
	 * trailing spaces? Yes. However, your reversed string should not contain
	 * leading or trailing spaces. How about multiple spaces between two words?
	 * Reduce them to a single space in the reversed string.
	 * 
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		if (s == null)
			return null;
		return null;
	}

	/**
	 * Problem 152 Maximum Product Subarray -- Find the contiguous subarray
	 * within an array (containing at least one number) which has the largest
	 * product.
	 * 
	 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3]
	 * has the largest product = 6.
	 * 
	 * @param nums
	 * @return dynamic programming
	 */
	public int maxProduct(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int[] max = new int[nums.length];
		int[] min = new int[nums.length];
		max[0] = nums[0];
		min[0] = nums[0];
		int tmp = max[0];
		for (int i = 1; i < nums.length; i++) {
			int val = nums[i];
			if (val > 0) {
				max[i] = max[i - 1] * val > val ? max[i - 1] * val : val;
				min[i] = min[i - 1] * val < val ? min[i - 1] * val : val;
			} else {
				max[i] = min[i - 1] * val > val ? min[i - 1] * val : val;
				min[i] = max[i - 1] * val < val ? max[i - 1] * val : val;
			}
			if (max[i] > tmp)
				tmp = max[i];
		}
		return tmp;
	}

	/**
	 * Problem 153 Find Minimum in Rotated Sorted Array -- Suppose a sorted
	 * array is rotated at some pivot unknown to you beforehand.
	 * 
	 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	 * 
	 * Find the minimum element.
	 * 
	 * @param nums
	 * @return
	 */
	public int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left != right) {
			int middle = (left + right) / 2;
			if (nums[middle] > nums[right]) {
				left = middle + 1;
			} else {
				right = middle;
			}
		}
		return nums[left];
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
	 * Problem 160 Intersection of Two Linked Lists Total -- Write a program to
	 * find the node at which the intersection of two singly linked lists
	 * begins.
	 * 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int lengthA = 0;
		int lengthB = 0;
		ListNode tmp = headA;
		while (tmp != null) {
			tmp = tmp.next;
			lengthA++;
		}
		tmp = headB;
		while (tmp != null) {
			tmp = tmp.next;
			lengthB++;
		}
		ListNode tmpA = headA;
		ListNode tmpB = headB;
		int diff = Math.abs(lengthA - lengthB);
		if (lengthA > lengthB) {
			while (diff-- > 0) {
				tmpA = tmpA.next;
			}
		}
		if (lengthA < lengthB) {
			while (diff-- > 0) {
				tmpB = tmpB.next;
			}
		}
		while (tmpA != null) {
			if (tmpA == tmpB)
				return tmpA;
			else {
				tmpA = tmpA.next;
				tmpB = tmpB.next;
			}
		}
		return null;
	}

	/**
	 * Problem 165 Compare Version Numbers -- Compare two version numbers
	 * version1 and version2. If version1 > version2 return 1, if version1 <
	 * version2 return -1, otherwise return 0.
	 * 
	 * You may assume that the version strings are non-empty and contain only
	 * digits and the . character. The . character does not represent a decimal
	 * point and is used to separate number sequences. For instance, 2.5 is not
	 * "two and a half" or "half way to version three", it is the fifth
	 * second-level revision of the second first-level revision.
	 * 
	 * Here is an example of version numbers ordering:
	 * 
	 * 0.1 < 1.1 < 1.2 < 13.37
	 * 
	 * @param version1
	 * @param version2
	 * @return
	 */
	public int compareVersion(String version1, String version2) {
		String[] vers1 = version1.split("\\.");
		String[] vers2 = version2.split("\\.");
		if (vers1.length == 0)
			vers1 = new String[] { version1 };
		if (vers2.length == 0)
			vers2 = new String[] { version2 };
		int i = 0;
		for (; i < vers1.length && i < vers2.length; i++) {
			int v1 = Integer.valueOf(vers1[i]);
			int v2 = Integer.valueOf(vers2[i]);
			if (v1 > v2)
				return 1;
			if (v1 < v2)
				return -1;
		}
		while (i < vers1.length) {
			if (Integer.valueOf(vers1[i++]) > 0)
				return 1;
		}
		while (i < vers2.length) {
			if (Integer.valueOf(vers2[i++]) > 0)
				return -1;
		}
		return 0;
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
	 * Problem 172 Factorial Trailing Zeroes -- Given an integer n, return the
	 * number of trailing zeroes in n!.
	 * 
	 * Note: Your solution should be in logarithmic time complexity.
	 * 
	 * @param n
	 * @return
	 */
	public int trailingZeroes(int n) {
		int res = 0;
		for (long i = 5; n / i >= 1; i *= 5)
			res += n / i;
		return res;
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
	 * Problem 198 House Robber -- You are a professional robber planning to rob
	 * houses along a street. Each house has a certain amount of money stashed,
	 * the only constraint stopping you from robbing each of them is that
	 * adjacent houses have security system connected and it will automatically
	 * contact the police if two adjacent houses were broken into on the same
	 * night.
	 * 
	 * Given a list of non-negative integers representing the amount of money of
	 * each house, determine the maximum amount of money you can rob tonight
	 * without alerting the police.
	 * 
	 * @idea Dynamic Programming: s[i] = Math.max(s[i - 2] + nums[i], s[i - 1])
	 *       and s[0] = nums[0]; s[1] = Math.max(nums[0], nums[1]);
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		int[] s = new int[nums.length];
		s[0] = nums[0];
		s[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			s[i] = Math.max(s[i - 2] + nums[i], s[i - 1]);
		}

		return s[nums.length - 1];
	}

	/**
	 * Problem 199 Binary Tree Right Side View -- Given a binary tree, imagine
	 * yourself standing on the right side of it, return the values of the nodes
	 * you can see ordered from top to bottom.
	 * 
	 * @idea use level order traversal and keep the first element in the new
	 *       level
	 * @param root
	 * @return
	 */
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root != null) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			int level = 1;
			int newLevel = 0;
			while (queue.size() > 0) {
				TreeNode node = queue.poll();
				if (node != null) {
					if (newLevel == 0)
						res.add(node.val);
					queue.offer(node.right);
					newLevel++;
					queue.offer(node.left);
					newLevel++;
				}
				level--;
				if (level == 0) {
					level = newLevel;
					newLevel = 0;
				}
			}
		}
		return res;
	}

	/**
	 * @idea use map to store the level-element pair, and the same key will be
	 *       Overwritten
	 * @param root
	 * @return
	 */
	public List<Integer> rightSideViewSimple(TreeNode root) {
		Map<Integer, Integer> m = new TreeMap<>();
		traverse(root, 0, m);
		return new ArrayList<>(m.values());
	}

	private void traverse(TreeNode node, int level, Map<Integer, Integer> m) {
		if (node == null) {
			return;
		}
		m.put(level, node.val);
		traverse(node.left, level + 1, m);
		traverse(node.right, level + 1, m);
	}

	/**
	 * Problem 200 Number of Islands -- Given a 2d grid map of '1's (land) and
	 * '0's (water), count the number of islands. An island is surrounded by
	 * water and is formed by connecting adjacent lands horizontally or
	 * vertically. You may assume all four edges of the grid are all surrounded
	 * by water.
	 * 
	 * @idea depth-first search or bread-first search
	 * @param grid
	 * @return
	 */
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int count = 0;
		int n = grid.length;
		int m = grid[0].length;
		int[][] visited = new int[n][m];
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char c = grid[i][j];
				if (c == '0')
					visited[i][j] = 1;
				if (c == '1' && visited[i][j] == 0) {
					count++;
					queue.offer(i);
					queue.offer(j);
					visited[i][j] = 1;
					while (!queue.isEmpty()) {
						int tmpi = queue.poll();
						int tmpj = queue.poll();
						if (tmpi < n - 1) {
							if (grid[tmpi + 1][tmpj] == '1'
									&& visited[tmpi + 1][tmpj] == 0) {
								queue.offer(tmpi + 1);
								queue.offer(tmpj);
								visited[tmpi + 1][tmpj] = 1;
							}
						}
						if (tmpj < m - 1) {
							if (grid[tmpi][tmpj + 1] == '1'
									&& visited[tmpi][tmpj + 1] == 0) {
								queue.offer(tmpi);
								queue.offer(tmpj + 1);
								visited[tmpi][tmpj + 1] = 1;
							}
						}
						if (tmpj > 0) {
							if (grid[tmpi][tmpj - 1] == '1'
									&& visited[tmpi][tmpj - 1] == 0) {
								queue.offer(tmpi);
								queue.offer(tmpj - 1);
								visited[tmpi][tmpj - 1] = 1;
							}
						}
						if (tmpi > 0) {
							if (grid[tmpi - 1][tmpj] == '1'
									&& visited[tmpi - 1][tmpj] == 0) {
								queue.offer(tmpi - 1);
								queue.offer(tmpj);
								visited[tmpi - 1][tmpj] = 1;
							}
						}
					}
				}
			}
		}
		return count;
	}

	/**
	 * Problem 201 Bitwise AND of Numbers Range -- Given a range [m, n] where 0
	 * <= m <= n <= 2147483647, return the bitwise AND of all numbers in this
	 * range, inclusive.
	 * 
	 * For example, given the range [5, 7], you should return 4.
	 * 
	 * @idea the result of a range bitwise is the common 'left header' of m and
	 *       n.
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
	 * Problem 202 Happy Number -- Write an algorithm to determine if a number
	 * is "happy".
	 * 
	 * A happy number is a number defined by the following process: Starting
	 * with any positive integer, replace the number by the sum of the squares
	 * of its digits, and repeat the process until the number equals 1 (where it
	 * will stay), or it loops endlessly in a cycle which does not include 1.
	 * Those numbers for which this process ends in 1 are happy numbers.
	 * 
	 * Example: 19 is a happy number
	 * 
	 * 12 + 92 = 82 82 + 22 = 68 62 + 82 = 100 12 + 02 + 02 = 1
	 * 
	 * @idea use set to store the number and once it shows again, return false,
	 *       otherwise when the sum equals one return true;
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
	 * Problem 203 Remove Linked List Elements -- Remove all elements from a
	 * linked list of integers that have value val.
	 * 
	 * Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 Return: 1
	 * --> 2 --> 3 --> 4 --> 5
	 * 
	 * @idea use two pointers, mind to deal with the case that the head val
	 *       equals the remove val
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
	 * @idea Sieve of Eratosthenes: start off with a table of n numbers. Let's
	 *       look at the first number, 2. We know all multiples of 2 must not be
	 *       primes, so we mark them off as non-primes. Then we look at the next
	 *       number, 3. Similarly, all multiples of 3 such as 3 �� 2 = 6, 3 �� 3 =
	 *       9, ... must not be primes, so we mark them off as well. Now we look
	 *       at the next number, 4, which was already marked off.
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
	 * Problem 205 Isomorphic Strings -- iven two strings s and t, determine if
	 * they are isomorphic.
	 * 
	 * Two strings are isomorphic if the characters in s can be replaced to get
	 * t.
	 * 
	 * All occurrences of a character must be replaced with another character
	 * while preserving the order of characters. No two characters may map to
	 * the same character but a character may map to itself.
	 * 
	 * For example, Given "egg", "add", return true.
	 * 
	 * Given "foo", "bar", return false.
	 * 
	 * Given "paper", "title", return true.
	 * 
	 * @idea use hashtable, if the table contains key s[i], check whether
	 *       val(s[i]) equals t[i], if not equal return false; else if the table
	 *       contains value t[i], return false since no two characters may map
	 *       to the same character, otherwise put (s[i],t[i]) into hashtable;
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
	 * Problem 206 Reverse Linked List -- Reverse a singly linked list.
	 * 
	 * @idea use two pointer, in every loop, reverse two node at a time and keep
	 *       one pointer going
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
	 * Problem 207 Course Schedule -- There are a total of n courses you have to
	 * take, labeled from 0 to n - 1.
	 * 
	 * Some courses may have prerequisites, for example to take course 0 you
	 * have to first take course 1, which is expressed as a pair: [0,1]
	 * 
	 * Given the total number of courses and a list of prerequisite pairs, is it
	 * possible for you to finish all courses?
	 * 
	 * For example:
	 * 
	 * 2, [[1,0]] There are a total of 2 courses to take. To take course 1 you
	 * should have finished course 0. So it is possible.
	 * 
	 * 2, [[1,0],[0,1]] There are a total of 2 courses to take. To take course 1
	 * you should have finished course 0, and to take course 0 you should also
	 * have finished course 1. So it is impossible.
	 * 
	 * @idea mark the node on current path as visiting and the node with dead
	 *       end as visited, and when the path goes back to some node marked
	 *       visiting, return false; otherwise return true when all the nodes
	 *       are visited
	 * @param numCourses
	 * @param prerequisites
	 * @return
	 */
	public boolean canFinishWithStack(int numCourses, int[][] prerequisites) {
		List<Course> courses = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			courses.add(new Course(i));
		}
		for (int i = 0; i < prerequisites.length; i++) {
			if (!courses.get(prerequisites[i][0]).prerequisites
					.contains(prerequisites[i][1]))
				courses.get(prerequisites[i][0]).prerequisites
						.add(prerequisites[i][1]);
		}
		Stack<Integer> stack = new Stack<>();
		for (Course course : courses) {
			if (course.status == 0) {
				stack.push(course.id);
			}
			while (!stack.isEmpty()) {
				int courseId = stack.peek();
				Course cur = courses.get(courseId);
				cur.status = 1;
				boolean flag = false;
				for (int pre : cur.prerequisites) {
					if (courses.get(pre).status == 1)
						return false;
					if (courses.get(pre).status == 2)
						continue;
					stack.push(pre);
					courses.get(pre).status = 1;
					flag = true;
				}
				if (cur.prerequisites.isEmpty() || !flag) {
					stack.pop();
					cur.status = 2;
				}
			}
		}
		return true;
	}

	/**
	 * @idea use Depth First Search to solve the problem, start with the node
	 *       with status 0, and mark it as 1 (visiting), if encounter some node
	 *       with status 1, return false; if encounter some node with status 2,
	 *       continue; otherwise start DFS on the node recursively and mark the
	 *       node with status 2 (visited)
	 * @param numCourses
	 * @param prerequisites
	 * @return
	 */
	public boolean canFinishWithRecurence(int numCourses, int[][] prerequisites) {
		List<Course> courses = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			courses.add(new Course(i));
		}
		for (int i = 0; i < prerequisites.length; i++) {
			if (!courses.get(prerequisites[i][0]).prerequisites
					.contains(prerequisites[i][1]))
				courses.get(prerequisites[i][0]).prerequisites
						.add(prerequisites[i][1]);
		}
		for (Course course : courses) {
			if (course.status == 0) {
				if (!DFS(courses, course.id))
					return false;
			}
		}
		return true;
	}

	private boolean DFS(List<Course> courses, int id) {
		Course cur = courses.get(id);
		cur.status = 1;
		for (int pre : cur.prerequisites) {
			if (courses.get(pre).status == 1)
				return false;
			if (courses.get(pre).status == 2)
				continue;
			if (!DFS(courses, pre))
				return false;
		}
		cur.status = 2;
		return true;
	}

	/**
	 * @idea first calculate the indegree of every node in the graph, and put
	 *       the node with indegree 0 into the queue or stack, while the queue
	 *       is not empty, remove one node from queue and update the indegree of
	 *       the adjacent nodes, put the new 0-indegree node into queue, if all
	 *       the nodes are put in the queue return true, otherwise return false;
	 * @param numCourses
	 * @param prerequisites
	 * @return
	 */
	public boolean canFinishWithIndegree(int numCourses, int[][] prerequisites) {
		List<Course> courses = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			courses.add(new Course(i));
		}
		for (int i = 0; i < prerequisites.length; i++) {
			Course cur = courses.get(prerequisites[i][0]);
			int pre = prerequisites[i][1];
			if (!cur.prerequisites.contains(pre)) {
				courses.get(pre).indegree++;
				cur.prerequisites.add(pre);
			}
		}
		Queue<Integer> queue = new LinkedList<>();
		for (Course course : courses) {
			if (course.indegree == 0) {
				queue.offer(course.id);
			}
		}
		int count = 0;
		while (!queue.isEmpty()) {
			int courseId = queue.poll();
			count++;
			for (int pre : courses.get(courseId).prerequisites) {
				courses.get(pre).indegree--;
				if (courses.get(pre).indegree == 0) {
					queue.offer(pre);
				}
			}
		}
		return count == numCourses;
	}

	class Course {
		List<Integer> prerequisites;
		int id;
		int status;
		int indegree;

		public Course(int id) {
			super();
			this.id = id;
			this.prerequisites = new ArrayList<>();
			this.status = 0;
			this.indegree = 0;
		}

	}

	/**
	 * Problem 217 Contains Duplicate
	 * 
	 * @idea use hashtable
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
	 * @idea use hashtable to store the number: if the table does not contain
	 *       the number, put it in; otherwise check whether the difference
	 *       between two index is less or equal to k
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
	 * @idea use tmp array to store the difference between two adjacent element,
	 *       return true if one of the element if tmp absolute val is not
	 *       greater than t, if not, calculate the sum in [i,i+k] and move the
	 *       interval forward till the end; if one of the sum is not greater
	 *       than t, return true, else return false;
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
	 * @idea Dynamic Programming: let sq[i][j] be the maximal square at the
	 *       point matrix[i][j], if matrix[i][j]='0', sq[i][j]=0; if
	 *       matrix[i][j]='1': if it's on left or top border, sq[i][j]=1;
	 *       otherwise, if both sq[i-1][j] and sq[i][j-1] are greater than 0,
	 *       when they are equal, check matrix[i-sq[i-1][j]], if it's '1',
	 *       sq[i][j] = sq[i-1][j]+1; else sq[i][j] = sq[i-1][j]; if not equal,
	 *       sq[i][j] = min(sq[i-1],sq[i][j-1])
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

	/**
	 * Problem 223 Rectangle Area -- Find the total area covered by two
	 * rectilinear rectangles in a 2D plane.
	 * 
	 * Each rectangle is defined by its bottom left corner and top right corner
	 * as shown in the figure.
	 * 
	 * @idea the area of the two rectangle equal the sum of the two rectangle
	 *       minus the common area of the two rectangle
	 * @param A
	 * @param B
	 * @param C
	 * @param D
	 * @param E
	 * @param F
	 * @param G
	 * @param H
	 * @return
	 */
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int sum = (C - A) * (D - B) + (G - E) * (H - F);
		return sum - intersection(A, C, E, G) * intersection(B, D, F, H);
	}

	private int intersection(int A, int B, int C, int D) {
		if (A < C) {
			if (B <= C) {
				return 0;
			} else {
				return Math.min(B - C, D - C);
			}
		} else {
			if (D <= A) {
				return 0;
			} else {
				return Math.min(B - A, D - A);
			}
		}
	}

	/**
	 * Problem 224 Basic Calculator -- Implement a basic calculator to evaluate
	 * a simple expression string.
	 * 
	 * The expression string may contain open ( and closing parentheses ), the
	 * plus + or minus sign -, non-negative integers and empty spaces .
	 * 
	 * You may assume that the given expression is always valid.
	 * 
	 * Some examples: "1 + 1" = 2 " 2-1 + 2 " = 3 "(1+(4+5+2)-3)+(6+8)" = 23
	 * 
	 * @param s
	 * @return
	 */
	public int calculate(String s) {
		Stack<String> stack = new Stack<>();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				continue;
			}
			if (c >= '0' && c <= '9') {
				buffer.append(c);
				if (i == s.length() - 1 || !Character.isDigit(s.charAt(i + 1))) {
					if (stack.isEmpty()) {
						stack.push(buffer.toString());
					} else {
						String peek = stack.peek();
						if (peek.equals("+")) {
							stack.pop();
							int op1 = Integer.valueOf(stack.pop());
							stack.push(String.valueOf(op1
									+ Integer.valueOf(buffer.toString())));
						} else if (peek.equals("-")) {
							stack.pop();
							int op1 = Integer.valueOf(stack.pop());
							stack.push(String.valueOf(op1
									- Integer.valueOf(buffer.toString())));
						} else {
							stack.push(buffer.toString());
						}
					}
					buffer.delete(0, buffer.length());
				}
			} else {
				switch (c) {
				case '+':
					stack.push(String.valueOf(c));
					break;
				case '-':
					stack.push(String.valueOf(c));
					break;
				case '(':
					stack.push(String.valueOf(c));
					break;
				case ')':
					String op = stack.pop();
					stack.pop();
					if (stack.isEmpty()) {
						stack.push(op);
					} else {
						String peek = stack.peek();
						if (peek.equals("+")) {
							stack.pop();
							int op1 = Integer.valueOf(stack.pop());
							stack.push(String.valueOf(op1 + Integer.valueOf(op)));
						} else if (peek.equals("-")) {
							stack.pop();
							int op1 = Integer.valueOf(stack.pop());
							stack.push(String.valueOf(op1 - Integer.valueOf(op)));
						} else {
							stack.push(op);
						}
					}
					break;
				default:
					break;
				}
			}
		}
		return Integer.valueOf(stack.pop());
	}

	/**
	 * Problem 226 Invert Binary Tree -- This problem was inspired by this
	 * original tweet by Max Howell: Google: 90% of our engineers use the
	 * software you wrote (Homebrew), but you can��t invert a binary tree on a
	 * whiteboard so fuck off. (https://twitter.com/mxcl)
	 * 
	 * @idea first revert the left and right subtree and recursively call
	 *       invertTree on left and right subtree;
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		if (root.left != null) {
			invertTree(root.left);
		}
		if (root.right != null) {
			invertTree(root.right);
		}
		return root;
	}

	/**
	 * Basic Calculator II -- Implement a basic calculator to evaluate a simple
	 * expression string.
	 * 
	 * The expression string contains only non-negative integers, +, -, *, /
	 * operators and empty spaces . The integer division should truncate toward
	 * zero.
	 * 
	 * You may assume that the given expression is always valid.
	 * 
	 * Some examples: "3+2*2" = 7 " 3/2 " = 1 " 3+5 / 2 " = 5
	 * 
	 * @param s
	 * @return
	 */
	public int calculate2(String s) {
		s = s.replace(" ", "");
		Stack<String> stack = new Stack<>();
		boolean shouldCalc = false;
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				continue;
			}
			if (c >= '0' && c <= '9') {
				buffer.append(c);
				if (i == s.length() - 1 || !Character.isDigit(s.charAt(i + 1))) {
					if (stack.isEmpty()) {
						stack.push(buffer.toString());
					} else {
						if (i < s.length() - 1
								&& (s.charAt(i + 1) == '*' || s.charAt(i + 1) == '/')) {
							if (shouldCalc) {
								calc(stack, Long.valueOf(buffer.toString()),
										s.charAt(i + 1));
							} else {
								stack.push(buffer.toString());
							}
						} else {
							shouldCalc = false;
							calc(stack, Long.valueOf(buffer.toString()),
									i == s.length() - 1 ? ' ' : s.charAt(i + 1));
						}
					}
					buffer.delete(0, buffer.length());
				}
			} else {
				if (c == '*' || c == '/')
					shouldCalc = true;
				stack.push(String.valueOf(c));
			}
		}
		return Integer.valueOf(stack.pop());
	}

	private void calc(Stack<String> stack, Long op2, char c) {
		String peek = stack.peek();
		String res = "";
		if (peek.equals("+")) {
			stack.pop();
			Long op1 = Long.valueOf(stack.pop());
			res = String.valueOf(op1 + op2);
		} else if (peek.equals("-")) {
			stack.pop();
			Long op1 = Long.valueOf(stack.pop());
			res = String.valueOf(op1 - op2);
		} else if (peek.equals("*")) {
			stack.pop();
			Long op1 = Long.valueOf(stack.pop());
			res = String.valueOf(op1 * op2);
		} else if (peek.equals("/")) {
			stack.pop();
			Long op1 = Long.valueOf(stack.pop());
			res = String.valueOf(op1 / op2);
		}
		if (c != '*' && c != '/' && !stack.isEmpty()) {
			calc(stack, Long.valueOf(res), ' ');
		} else {
			stack.push(res);
		}
	}

	/**
	 * Problem 228 Summary Ranges -- Given a sorted integer array without
	 * duplicates, return the summary of its ranges.
	 * 
	 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
	 * 
	 * @idea mind the beginning and the ending of the array
	 * @param nums
	 * @return
	 */
	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<String>();
		if (nums == null || nums.length == 0)
			return res;
		int val = nums[0];
		int start = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1] + 1) {
				if (i == start + 1) {
					res.add(val + "");
					if (i == nums.length - 1) {
						res.add(nums[i] + "");
					}

				} else {
					res.add(val + "->" + nums[i - 1]);
					if (i == nums.length - 1) {
						res.add(nums[i] + "");
					}

				}
				val = nums[i];
				start = i;
			} else if (i == nums.length - 1) {
				res.add(val + "->" + nums[i]);
			}
		}
		if (nums.length == 1)
			res.add(val + "");
		return res;
	}
}

/**
 * Problem 225 Implement Stack using Queues -- Implement the following
 * operations of a stack using queues.
 * 
 * push(x) -- Push element x onto stack. pop() -- Removes the element on top of
 * the stack. top() -- Get the top element. empty() -- Return whether the stack
 * is empty. Notes: You must use only standard operations of a queue -- which
 * means only push to back, peek/pop from front, size, and is empty operations
 * are valid. Depending on your language, queue may not be supported natively.
 * You may simulate a queue by using a list or deque (double-ended queue), as
 * long as you use only standard operations of a queue. You may assume that all
 * operations are valid (for example, no pop or top operations will be called on
 * an empty stack).
 * 
 * @idea Use to queues to act like a stack, always keep one queue empty, and
 *       push will be added at the tail of the nonempty queue, and top or pop
 *       will be implemented in the way: pop all the elements in the nonempty
 *       queue into the empty queue and deal with the last element
 * @author Administrator
 * 
 */
class MyStack {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	public MyStack() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}

	// Push element x onto stack.
	public void push(int x) {
		if (!queue1.isEmpty()) {
			queue1.offer(x);
		} else if (!queue2.isEmpty()) {
			queue2.offer(x);
		} else {
			queue1.offer(x);
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			throw new EmptyStackException();
		}
		if (!queue1.isEmpty()) {
			int size = queue1.size();
			while (size-- > 1) {
				queue2.offer(queue1.peek());
				queue1.poll();
			}
			queue1.poll();
		} else {
			int size = queue2.size();
			while (size-- > 1) {
				queue1.offer(queue2.peek());
				queue2.poll();
			}
			queue2.poll();
		}
	}

	// Get the top element.
	public int top() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			throw new EmptyStackException();
		}
		if (!queue1.isEmpty()) {
			int size = queue1.size();
			while (size-- > 1) {
				queue2.offer(queue1.peek());
				queue1.poll();
			}
			int res = queue1.poll();
			queue2.offer(res);
			return res;
		} else {
			int size = queue2.size();
			while (size-- > 1) {
				queue1.offer(queue2.peek());
				queue2.poll();
			}
			int res = queue2.poll();
			queue1.offer(res);
			return res;
		}
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue1.isEmpty() && queue2.isEmpty();
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