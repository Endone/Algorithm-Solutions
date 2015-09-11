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
	 * 从第i个数开始，向前遍历之前的数，找到第一个比第i个数小的数的位置j，将第i个数插入j+1的位置
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
	 * 步数递减的插入排序，步数由数组长度的1/2开始，对数递减，每次遍历步数间隔之间的数，如0~step=5;剩下的步骤与插入排序一直，
	 * 只不过用step替换简单插入排序的1，当step为1时，结束排序
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
	 * 从i开始，向后对相邻的数一一比较，大的向后，小的向前，这样保证一轮结束后最大的数在数组末尾
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
	 * 从头开始寻找最大的数，找到后放到末尾
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
	 * 以第一个元素为Pivot，首先从尾部开始找到第一个小于pivot的位置，以i位置交换，并将i向尾部推进，然后从i开始找到第一个大于pivot的位置
	 * ，并与j位置调换，j-- 最后i=j的时候，将pivot放入i，然后递归执行
	 * 
	 * @param nums
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] nums, int left, int right) {
		if (left < right) {
			int i = partition(nums, left, right);// 先成挖坑填数法调整s[]
			quickSort(nums, left, i - 1); // 递归调用
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
	 * 通过不停的建堆和替换出堆顶元素来排序，建堆过程：从长度的1/2处开始检查节点是否违反大顶堆规则，如果违反，找到子节点中较大的节点，与父节点调换，
	 * 并继续检测调换后节点是否违反大顶堆规则，一次建完后，将堆顶元素替换到尾部已排序数组，再次建堆
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
	 * 先将数组分成两个数组并保证left小于right，然后从下向上合并数组
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
	 * 利用原数组A的空间，两个下标i和j分别遍历L1和L2。注意：当L2当前元素较小时，会覆盖L1的元素。可以利用插入排序，将nums[j]插入到L1中
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
	 * 根据nums中最大的整数值，建立大小为n的bucket数组，遍历nums，其中数值对应的bucket计数
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
