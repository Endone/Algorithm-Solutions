package test;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 10, 1, 8, 9, 6, 7, 3, 5, 4 };
		// insertionSort(nums);
		// bubbleSort(nums);
		// selectionSort(nums);
		// shellSort(nums);
		// heapSort(nums);
		// mergeSort(nums, 0, nums.length - 1);
		// quickSort(nums, 0, nums.length - 1);
		bucketSort(nums, 11);
	}

	/**
	 * �ӵ�i������ʼ����ǰ����֮ǰ�������ҵ���һ���ȵ�i����С������λ��j������i��������j+1��λ��
	 * 
	 * @param nums
	 */
	public static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int val = nums[i];
			int j = i - 1;
			for (; j >= 0 && nums[j] > val; j--) {
				nums[j + 1] = nums[j];
			}
			nums[j + 1] = val;
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

	/**
	 * �����ݼ��Ĳ������򣬲��������鳤�ȵ�1/2��ʼ�������ݼ���ÿ�α����������֮���������0~step=5;ʣ�µĲ������������һֱ��
	 * ֻ������step�滻�򵥲��������1����stepΪ1ʱ����������
	 * 
	 * @param nums
	 */
	public static void shellSort(int[] nums) {
		int step = nums.length / 2;
		while (true) {
			for (int k = 0; k < step; k++) {
				for (int i = step + k; i < nums.length; i += step) {
					int val = nums[i];
					int j = i - step;
					for (; j >= 0 && nums[j] > val; j -= step) {
						nums[j + step] = nums[j];
					}
					nums[j + step] = val;
				}
			}
			step = step / 2;
			if (step == 1) {
				break;
			}
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

	/**
	 * ��i��ʼ���������ڵ���һһ�Ƚϣ�������С����ǰ��������֤һ�ֽ�����������������ĩβ
	 * 
	 * @param nums
	 */
	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int tmp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

	/**
	 * ��ͷ��ʼѰ�����������ҵ���ŵ�ĩβ
	 * 
	 * @param nums
	 */
	public static void selectionSort(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			int index = i;
			for (int j = 0; j <= i; j++) {
				if (nums[j] > nums[index]) {
					index = j;
				}
			}
			if (index != i) {
				int tmp = nums[i];
				nums[i] = nums[index];
				nums[index] = tmp;
			}
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

	/**
	 * �Ե�һ��Ԫ��ΪPivot�����ȴ�β����ʼ�ҵ���һ��С��pivot��λ�ã���iλ�ý���������i��β���ƽ���Ȼ���i��ʼ�ҵ���һ������pivot��λ��
	 * ������jλ�õ�����j-- ���i=j��ʱ�򣬽�pivot����i��Ȼ��ݹ�ִ��
	 * 
	 * @param nums
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] nums, int left, int right) {
		if (left < right) {
			int i = partition(nums, left, right);// �ȳ��ڿ�����������s[]
			quickSort(nums, left, i - 1); // �ݹ����
			quickSort(nums, i + 1, right);
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

	public static int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		int i = left;
		int j = right;
		while (i < j) {
			while (nums[j] >= pivot && i < j)
				j--;
			if (i < j) {
				nums[i] = nums[j];
				i++;
			}
			while (i < j && nums[i] < pivot)
				i++;
			if (i < j) {
				nums[j] = nums[i];
				j--;
			}
		}
		nums[i] = pivot;
		return i;
	}

	/**
	 * ͨ����ͣ�Ľ��Ѻ��滻���Ѷ�Ԫ�������򣬽��ѹ��̣��ӳ��ȵ�1/2����ʼ���ڵ��Ƿ�Υ���󶥶ѹ������Υ�����ҵ��ӽڵ��нϴ�Ľڵ㣬�븸�ڵ������
	 * ��������������ڵ��Ƿ�Υ���󶥶ѹ���һ�ν���󣬽��Ѷ�Ԫ���滻��β�����������飬�ٴν���
	 * 
	 * @param nums
	 */
	public static void heapSort(int[] nums) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			buildHeap(nums, length - i);
			swap(nums, 0, length - i - 1);
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}

	private static void buildHeap(int[] nums, int length) {
		for (int i = length / 2 - 1; i >= 0; i--) {
			int j = i;
			while (j < length / 2) {
				int left = 2 * j + 1;
				int right = 2 * (j + 1);
				int index = j;
				if (right < length) {
					index = nums[left] > nums[right] ? left : right;
				} else {
					index = left;
				}
				if (nums[j] < nums[index]) {
					int tmp = nums[j];
					nums[j] = nums[index];
					nums[index] = tmp;
					j = index;
				} else {
					break;
				}
			}
		}
	}

	private static void swap(int[] data, int i, int j) {
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	/**
	 * �Ƚ�����ֳ��������鲢��֤leftС��right��Ȼ��������Ϻϲ�����
	 * 
	 * 
	 * @param nums
	 * @param left
	 * @param right
	 */
	public static void mergeSort(int[] nums, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(nums, left, middle);
			mergeSort(nums, middle + 1, right);
			merge(nums, left, middle, right);
			System.out.println(left + ":" + right);
			for (int val : nums) {
				System.out.print(val);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	/**
	 * ����ԭ����A�Ŀռ䣬�����±�i��j�ֱ����L1��L2��ע�⣺��L2��ǰԪ�ؽ�Сʱ���Ḳ��L1��Ԫ�ء��������ò������򣬽�nums[j]���뵽L1��
	 * 
	 * @param nums
	 * @param left
	 * @param middle
	 * @param right
	 */
	private static void merge(int[] nums, int left, int middle, int right) {
		int[] tmp = new int[right - left + 1];
		int i = left;
		int j = middle + 1;
		int k = 0;
		while (i <= middle && j <= right) {
			if (nums[i] > nums[j]) {
				tmp[k++] = nums[j++];
			} else {
				tmp[k++] = nums[i++];
			}
		}
		while (i <= middle) {
			tmp[k++] = nums[i++];
		}
		while (j <= right) {
			tmp[k++] = nums[j++];
		}
		k = 0;
		while (left <= right) {
			nums[left++] = tmp[k++];
		}
	}

	public static void radixSort(int[] nums) {

	}

	/**
	 * ����nums����������ֵ��������СΪn��bucket���飬����nums��������ֵ��Ӧ��bucket����
	 * 
	 * @param nums
	 * @param n
	 */
	public static void bucketSort(int[] nums, int n) {
		int[] buckets = new int[n];
		for (int val : nums) {
			buckets[val]++;
		}
		int k = nums.length - 1;
		for (int i = n - 1; i >= 0;) {
			if (buckets[i] != 0) {
				nums[k--] = i;
				buckets[i]--;
			} else {
				i--;
			}
		}
		for (int val : nums) {
			System.out.println(val);
		}
	}
}
