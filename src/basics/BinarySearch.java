package basics;
import java.util.*;

public class BinarySearch {
	
	static int ans = -1;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Please enter input in Sorted order (Ascending)");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		binS(arr, search, 0, n-1);
		if(ans!=-1)
			System.out.println("Element is present at index" + ans+1);
		else
			System.out.println("Element is not present");
	}
	
	public static void binS(int arr[], int search, int start, int end) {
		if(start>end) 
			return;
		int mid = (start+end)/2;
		if(arr[mid] == search) {
			ans = mid;
			return;
		}
		if(start == end) {
			return;
		}
		else if(arr[mid]>search) {
//			element is before
			binS(arr, search, start, mid-1);
		}
		else {
//			element is after
			binS(arr, search, mid+1, end);
		}
		
	}
	
}
