package ����.��������;
/*
 * �������򣬽����ݷ�Ϊ����������ģ���û����ģ�
 * �ҵ��ò����λ�ã�ͣ�²���
 * �����٣�
 * ʱ�临�Ӷ�
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
