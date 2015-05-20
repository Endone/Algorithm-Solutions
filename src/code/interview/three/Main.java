package code.interview.three;

/**
 * ��Ŀ������һ���������飬������������Ҳ�и�����������������һ�������������һ�������飬ÿ�������鶼��һ���͡�������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO
 * (n)��
 * 
 * �������������Ϊ1, -2, 3, 10, -4, 7, 2, -5��������������Ϊ3, 10, -4, 7, 2��������Ϊ��������ĺ�18��
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
