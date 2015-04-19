package leetcode.number.of.one.bits;

public class Solution {
	public static void main(String[] args) {
		System.out.println(new Solution().hammingWeight(0xffffffff));
	}

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
}