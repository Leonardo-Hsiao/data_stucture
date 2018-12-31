package 计数排序;
/*
 * 计数排序是一种线性排序
 * 用空间换时间 对排序的内容有要求大于0.最大数不是很大的整数
 * 找出最大值，创建一个记录每个数出现多少次的数组，数组长度等于最大值加一
 * 再根据此数组，来改写原数组；
 * 
 * 思想简单
 * 时间复杂度O（n）
 * 
 * 
 * */
import java.util.Arrays;

public class CountSortDemo {
	public static void main(String[] args) {
		int[] arr = new int[] {12,15,0,87,54,15,19,84,17};
		countSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void countSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length<=1) {
			return ;
		}
		int max=arr(arr);
		int[] count = new int[max+1];
		Arrays.fill(count,0);
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		int k=0;
		for(int i=0;i<=max;i++) {
			for(int j=0;j<count[i];j++) {
				arr[k++]=i;
			}
		}
	}

	private static int arr(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}

		return max;
	}

}
