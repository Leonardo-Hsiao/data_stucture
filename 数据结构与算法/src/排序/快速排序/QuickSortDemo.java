package ��������;
/**
 * partition �ָ�
 * pivot
 * left
 * right
 * ��������Ѱ��һ����׼������С�ķ���ߣ���ķ��ұߣ�
 * ʱ�临�Ӷ�O(nlogn)
 * partition���Ӷ�n����Ҫ�ݹ�log2n��  Ϊʲô�أ���Ϊÿ�εݹ鳤�ȶ�����
 * Ҫ�Ƚ���һ��quicksort�����������ж�
 * �ٽ��������ݹ�ĺ���sort�������Դ��ݲ���left right
 * ��дһ���ָ��partition����
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
