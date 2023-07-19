package array1;

import java.util.Scanner;

public class merge_array {

	public static void main(String[] args) {
		int n,count=0,j=0;
		System.out.println("enter the size of both arrays:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		int arr1[]=new int[n];
		System.out.println("enter the first array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the second  array elements:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("merge both array:");
		int arr2[]=new int[n*2];
		for(int i=0;i<n;i++) {
			arr2[j]=arr[i];
			j++;
		}
		for(int i=0;i<n;i++) {
			arr2[j]=arr1[i];
			j++;
		}
		for(int i=0;i<n*2;i++) {
			System.out.println(arr2[i]);
		}
	}
}
