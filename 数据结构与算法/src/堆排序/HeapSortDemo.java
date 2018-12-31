package ������;
/*
 * heap 
 * ������զһ���е㸴�ӣ���ʵ�򵥣�����Ҫ�࿴����������
 * ע�⣺������ɵ�����������ں��棬Ҫ����ʹ󶥶ѣ�Ҫ�����С����
 * �Ƚ����󶥶�
 * ������������λ�ã��������һ����
 * �������ѣ��ٽ���
 * 
 * heap ��
 * adjust ����
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
		for(int i=arr.length/2-1;i>=0;i--) { //��ʼλ���ǵ�һ�����ֽڵ��λ�ã������Լ�����
			adjustHeap(arr,i,arr.length-1);
		}
		for(int j=arr.length-1;j>0;j--) {
			swap(arr,0,j);
			adjustHeap(arr,0,j-1);  //�˴���ע���һ��
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void adjustHeap(int[] arr, int start, int end) { //end�ǿ��Ե����
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
