package array;

import java.util.Scanner;

public class sum_odd {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int arr[]= new int[size] ;
		int sum=0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0) {
			System.out.println(arr[i]);
			sum=arr[i]+sum;
		}
	}
		System.out.println("The sum is " + sum);
	}
}
