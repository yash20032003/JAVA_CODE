package array1;
import java.util.Scanner;
public class index_element {

	public static void main(String[] args) {
		int n,target;
		System.out.println("enter the sze of the array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the target value:");
		target=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(target==arr[i]) {
				System.out.println("The element is found at index :"+i);
			}
		}
		if(target<0) {
			System.out.println("The element is not found");
		}
	}
}
