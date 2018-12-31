package 堆排序;
/*
 * heap 
 * 堆排序，咋一看有点复杂，其实简单，不过要多看看，别忘了
 * 注意：排序完成的数，必须放在后面，要升序就大顶堆，要降序就小顶堆
 * 先建立大顶堆
 * 交换顶和最后的位置，排序完成一个，
 * 调整顶堆，再交换
 * 
 * heap 堆
 * adjust 调整
 * */
import java.util.Arrays;

public class HeapSortDemo {
	public static void main(String[] args) {
		int[] arr= new int[] {85,15,16,48,2,0,99,75,14};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length<=1) {
			return ;
		}
		for(int i=arr.length/2-1;i>=0;i--) { //起始位置是第一个有字节点的位置，不信自己试试
			adjustHeap(arr,i,arr.length-1);
		}
		for(int j=arr.length-1;j>0;j--) {
			swap(arr,0,j);
			adjustHeap(arr,0,j-1);  //此处，注意减一！
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void adjustHeap(int[] arr, int start, int end) { //end是可以到达的
		// TODO Auto-generated method stub
		int dad=start;
		int son=dad*2+1;
		while(son<=end) {
			if(son+1<=end && arr[son+1]>arr[son]) {
				son++;
			}
			if(arr[son]<=arr[dad]) {
				return ;
			}else {
				swap(arr,dad,son);
				dad=son;
				son=dad*2+1;
			}
		}
	}
}
