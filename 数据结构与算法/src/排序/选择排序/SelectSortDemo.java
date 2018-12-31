package 排序.选择排序;

/**
 * 
 * 选择排序，基本，不多说 
 * 时间复杂度O(n)
 */
public class SelectSortDemo {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 8, 48, 79, 65, 47, 12, 18 };
		selectSortDemo(arr);
		for (int a : arr) {
			System.out.println(a + " ");
		}

	}

	private static void selectSortDemo(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					swap(arr, j, minIndex);
				}
			}

		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
