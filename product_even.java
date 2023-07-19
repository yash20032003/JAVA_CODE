package array;

import java.util.Scanner;

public class product_even {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int arr[]= new int[size] ;
		int mult=1;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("Even number product is :");
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
			System.out.print(arr[i]+",");
			mult=arr[i]*mult;
		}
	}
		System.out.println();
		System.out.println("The sum is: " + mult);

	}

}
