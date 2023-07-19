package array2;

import java.util.Scanner;

public class second_min {

	public static void main(String[] args) {
		int size,count=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("elements of the array:");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		
		int min=arr[0];
		for(int i=1;i<size;i++) {
		
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		int minus = 0,j = 0;
		int arr1[]=new int[size-1];
		for(int i=0;i<size;i++) {
			if(min!=arr[i]) {
				minus=arr[i]-min;
				arr1[j]=minus;
				j++;
			}
		}
		
		int min2 =arr1[0];
		for(int i=0;i<size-1;i++) {
			
			if(min2>arr1[i]) {
				min2=arr1[i];
			}
			
		}
		
        for(int i=0;i<size;i++) {
			
			if(min2==(arr[i]-min)) {
				System.out.println("The second minimum element is :"+arr[i]);
			}
		}
	}
}
