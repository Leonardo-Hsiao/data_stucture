package �鲢����;
/*
 * �鲢����
 * �ṹ�Ϳ���һ��
 * ������mergesort����sort
 * mid�ֿ����ݹ�sort
 * �ݹ������merge �ϲ�
 * ʱ�临�Ӷ�O��nlog2n��
 * merge �ϲ�
 * 
 * 
 * 
 * */
public class MergeSortDemo {
	public static void main(String[] args) {
		int[] arr = new int[] {8,3,7,12,18,15,48,79,24,15,18,34,0};
		mergeSort(arr);
		for(int a: arr) {
			System.out.print(a+" ");
		}
//		System.out.println(arr.length);
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length<=1) {
			return ;
		}
		sort(arr,0,arr.length-1);
		return ;
	}

	private static void sort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right) {
			return ;
		}
		int mid=(left+right)/2;
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int[] temp = new int[right+1-left];
		int i=left;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j])
			{
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=right) {
			temp[k++]=arr[j++];
		}
		for(int x=0;x<temp.length;x++) {
			arr[left+x]=temp[x];     //ע��˴�arr���±�
		}
	}

}
