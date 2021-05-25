package basics;
import java.util.*;

public class AdditionInArray {
//	Using 2 pointers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter sorted Array as Input");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int start = 0;
		int end = n-1;
		boolean ans = false;
		while(start<end) {
			int sum = arr[start]+arr[end];
			if(sum == target) {
				ans = true;
				break;
			}
			else if(sum<target) {
				start++;
			}
			else {
				end--;
			}
		}
		if(ans) {
			System.out.println(arr[start]+" & "+arr[end]);
		}
		else {
			System.out.println("Not possible");
		}
	}
}
