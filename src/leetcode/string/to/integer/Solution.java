package leetcode.string.to.integer;

public class Solution {
	public static void main(String[] args) {
		System.out.println(new Solution().myAtoi("-1"));
	}

	public int myAtoi(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		str = str.trim();
		int flag = 0;
		boolean positive = true;
		while (str.charAt(flag) == 43 || str.charAt(flag) == 45) {
			if (str.charAt(flag) == 45)
				positive = !positive;
			flag++;
		}
		int sum = 0;
		int factor = 1;
		for (int i = str.length() - 1; i >= flag; i--) {
			int digit = str.charAt(i) - 48;
			sum += factor * digit;
			factor *= 10;
		}
		return positive ? sum : -sum;
	}
}