package 排序.插入排序;
/*
 * 插入排序，将数据分为两拨，排完的，和没排完的，
 * 找到该插入的位置，停下插入
 * 代码少！
 * 时间复杂度
 * */
import java.util.Arrays;

public class InsertSortDemo {
	public static void main(String[] args) {
		int[] arr = new int[] {4,48,15,13,47,51,85,96};
		insertSort(arr);
		System.out.println("arr:"+Arrays.toString(arr));
		
	}
	public static void insertSort(int[] arr) {
		if(arr == null || arr.length<=1) {
			return ;
		}
		for(int i=1;i<arr.length;i++) {
			int insertIndex=i;
			int value=arr[insertIndex];
			while(insertIndex>0 && arr[insertIndex-1]>arr[insertIndex]) {
				arr[insertIndex]=arr[insertIndex-1];
				insertIndex--;
			}
			arr[insertIndex] = value;
		}
	}

}
