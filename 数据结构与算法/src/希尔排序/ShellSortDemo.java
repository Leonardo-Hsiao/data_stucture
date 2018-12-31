package 希尔排序;
/*
 * 希尔排序：其实就是分开的插入排序，简单
 * 先建立shellsort函数，计算增量d，传入函数shellinsert
 * shellinsert内部和插入排序类似，但是要注意一些小细节
 * 时间复杂度
 * 
 * 
 * */
public class ShellSortDemo {
	public static void main(String[] args) {
		int[] arr = new int [] {2,87,15,48,16,49,15,75,12};
		shellSort(arr);
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
	
	public static void shellSort(int[] arr) {
		if(arr== null || arr.length<=1) {
			return ;
		}
		int d=arr.length/2;
		while(d>=1) {
			shellInsert(arr,d);
			d/=2;
		}
		return ;
		
	}
	private static void shellInsert(int[] arr, int d) {
		// TODO Auto-generated method stub
		for(int i=d;i<arr.length;i++) {
			int insertIndex=i;
			int value=arr[i];
			while(insertIndex-d>=0 && arr[insertIndex-d]>arr[insertIndex]) { //注意此处，判断数组越界
				arr[insertIndex]=arr[insertIndex-d];
				insertIndex-=d;
			}
			arr[insertIndex] = value;
		}
		return ;
	}

}
