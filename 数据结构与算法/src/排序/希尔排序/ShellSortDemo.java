package ϣ������;
/*
 * ϣ��������ʵ���Ƿֿ��Ĳ������򣬼�
 * �Ƚ���shellsort��������������d�����뺯��shellinsert
 * shellinsert�ڲ��Ͳ����������ƣ�����Ҫע��һЩСϸ��
 * ʱ�临�Ӷ�
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
			while(insertIndex-d>=0 && arr[insertIndex-d]>arr[insertIndex]) { //ע��˴����ж�����Խ��
				arr[insertIndex]=arr[insertIndex-d];
				insertIndex-=d;
			}
			arr[insertIndex] = value;
		}
		return ;
	}

}
