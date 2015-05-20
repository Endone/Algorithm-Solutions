package leetcode.excel.sheet.column.number;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().titleToNumber("AAA"));
	}

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
}