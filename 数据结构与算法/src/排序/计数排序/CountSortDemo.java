package ��������;
/*
 * ����������һ����������
 * �ÿռ任ʱ�� �������������Ҫ�����0.��������Ǻܴ������
 * �ҳ����ֵ������һ����¼ÿ�������ֶ��ٴε����飬���鳤�ȵ������ֵ��һ
 * �ٸ��ݴ����飬����дԭ���飻
 * 
 * ˼���
 * ʱ�临�Ӷ�O��n��
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
