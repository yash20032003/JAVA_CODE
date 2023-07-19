package array1;

import java.util.Scanner;

public class sum_element {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=arr[i]+sum;
		}
		System.out.println("The sum of the array is :"+sum);
	}

}
