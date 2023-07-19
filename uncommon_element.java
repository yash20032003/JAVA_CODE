package array1;

import java.util.Scanner;

public class uncommon_element {

	public static void main(String[] args) {
		int n,count=0,k=0,count1=0;
		System.out.println("enter the size of both arrays:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		int arr1[]=new int[n];
		int arr2[]= new int[n];
		System.out.println("enter the first array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the second  array elements:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("The uncommon elements are:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]==arr1[i]) {
					arr2[k]=arr[j];
					k++;		
					
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr2[j]==arr[i])
				{
					count++;
				}
			}
			if(count==0) {
				System.out.println(arr[i]);
			}
			count=0;
		}	
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr2[j]==arr1[i])
				{
					count1++;
				}
			}
			if(count1==0) {
				System.out.println(arr1[i]);
			}
			count1=0;
		}	
	}

}
