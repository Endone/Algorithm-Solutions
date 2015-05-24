package leetcode.string.to.integer;

public class Solution {
	public static void main(String[] args) {
		System.out.println(new Solution().myAtoi("  -+12"));
	}

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
}