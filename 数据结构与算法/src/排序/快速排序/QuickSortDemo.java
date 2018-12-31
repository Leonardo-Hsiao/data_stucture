package 快速排序;
/**
 * partition 分割
 * pivot
 * left
 * right
 * 快速排序，寻找一个基准数，将小的放左边，大的放右边，
 * 时间复杂度O(nlogn)
 * partition复杂度n，需要递归log2n次  为什么呢，因为每次递归长度都减半
 * 要先建立一个quicksort（）函数，判断
 * 再建立用来递归的函数sort（）可以传递参数left right
 * 再写一个分割函数partition（）
 * 
 */
public class QuickSortDemo {
	public static void main(String[] args) {
		int[] arr= new int[] {1,48,100,78,45,12,13,46,79};
		quickSort(arr);
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
	public static void quickSort(int[] arr) {
		if(arr == null || arr.length<=1) {
			return ;
		}
		sort(arr,0,arr.length-1);
		return ;
	}
	private static void sort(int[] arr, int left, int right) {
		if(left>=right) {
			return ;
		}
		int mid=partition(arr,left,right);
		sort(arr,left,mid-1);
		sort(arr,mid+1,right);
		
	}
	private static int partition(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int pivot=left;
		int pivotkey=arr[left];
		while(left<right) {
			while(left<right && arr[right]>=pivotkey) {
				right--;
			}
			while(left<right && arr[left]<=pivotkey) {
				left++;
			}
			swap(arr,left,right);
		}
		swap(arr,left,pivot);
		return left;
	}
	private static void swap(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}

}
