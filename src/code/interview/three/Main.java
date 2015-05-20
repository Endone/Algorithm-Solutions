package code.interview.three;

/**
 * 题目：输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。求所有子数组的和的最大值。要求时间复杂度为O
 * (n)。
 * 
 * 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，因此输出为该子数组的和18。
 * 
 * @author Administrator
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(largestSumOfSubArray(new int[] { 1, -2, 3, 10, -4,
				7, 2, -5 }));
		System.out.println(largestSumOfSubArray(new int[] { -1, -2, -3, -10,
				-4, -7, -2, -5 }));
		System.out.println(largestSumOfSubArray(new int[] { -3, -2 }));
	}

	public static int largestSumOfSubArray(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException();
		}
		int sum = 0;
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
			if (sum < 0)
				sum = 0;
			else if (sum > max) {
				max = sum;
			}
		}
		if (max == 0) {
			max = data[0];
			if (data.length > 1) {
				for (int i = 1; i < data.length; i++) {
					if (data[i] > max) {
						max = data[i];
					}
				}
			}
		}
		return max;
	}
}
