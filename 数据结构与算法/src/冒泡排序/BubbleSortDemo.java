package 冒泡排序;

import java.util.Arrays;

/*
 * bubble 气泡
 * 冒泡排序，不多解释，基本
 * 时间复杂度
 * */
public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = new int[] {5,8,7,12,52,68};	
		bubbleSortDemo(arr);
		System.out.println("arr:"+Arrays.toString(arr));

	}

	private static void bubbleSortDemo(int[] arr) {
		// TODO Auto-generated method stub
		if(arr==null || arr.length<=1) {
			return ;
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j,j-1);
				}
				
			}
		}
		
	}

	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
