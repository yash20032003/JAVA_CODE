package array2;

import java.util.Scanner;

public class Strong_num {

	public static void main(String[] args) {
		int size,count=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		if(size==0) {
			System.out.println("Element does not exixt..");
		}
		System.out.println("elements of the array:");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			int n=arr[i];
			while(n>0)
			{
				sum=sum+n;
				n--;
			}
			if(sum==arr[i]) {
				System.out.println("The strongest number is"+arr[i]);
			}else
			{
				sum=0;
			}
		}

	}

}
