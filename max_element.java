package array2;

import java.util.Scanner;

public class max_element {

	public static void main(String[] args) {
		int size,count=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		if(size==0) {
			System.out.println("Element does not exixt..");
		}else {
		System.out.println("elements of the array:");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=1;i<size;i++) {
		
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		if(size==1) {
			System.out.println("The second maximum element is :"+arr[0]);
		}else {
			
		int plus = 0,j = 0;
		int arr1[]=new int[size-1];
		for(int i=0;i<size;i++) {
			if(max!=arr[i]) {
				plus=arr[i]+max;
				arr1[j]=plus;
				j++;
			}
		}
		
		int max2 =arr1[0];
		for(int i=0;i<size-1;i++) {
			
			if(max2<arr1[i]) {
				max2=arr1[i];
			}
		}
		
        for(int i=0;i<size;i++) {
			
			if(max2==(arr[i]+max)) {
				System.out.println("The second maximum element is :"+arr[i]);
			}
        }
		}
		}
	}

}
