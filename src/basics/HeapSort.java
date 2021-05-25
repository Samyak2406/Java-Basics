package basics;
import java.util.*;

public class HeapSort {
//	child1 = 2*i+1
//	child2 = 2*i+2
	public static void sort(int arr[]) {
		int n = arr.length;
		for(int i = n/2-1; i>-1;i--) {
			heapify(arr, n, i);
		}
//		for(int i = 0;i<n;i++)
//			System.out.print(arr[i]+" ");
//		System.out.println();
//		root is the max element

		for(int i = n-1;i>-1;i--) {
//			System.out.println("max is : "+ arr[0]);
			
			swap(0, i, arr);
			heapify(arr, i, 0);
		}
		
	}
	
	public static void swap(int a, int b, int arr[]) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void heapify(int arr[], int n, int index) {
		 int max = index, child1 = 2*index+1, child2 = 2*index+2;
		 if(child1<n && arr[child1]>arr[index])
			 max = child1;
		 if(child2<n && arr[child2]>arr[max])
			 max = child2;
//		 for(int j = 0;j<n;j++)
//				System.out.print(arr[j]+" ");
//			System.out.println();
//		 System.out.println("index is :"+ index+" "+ child1 + " " + child2 + " " + max);
//		 if root aint max swap root with max child
		 
		 if(max!=index) {
//			 now check if the new element that came is in ok position
			 swap(index, max, arr);
			 heapify(arr, n, max);
		 }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
//		sort this array
		
		sort(arr);
		for(int i = 0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
