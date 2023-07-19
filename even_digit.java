package array1;

import java.util.Scanner;

public class even_digit {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("enter the sze of the array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the array elements:");
		System.out.println(n);
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			while(arr[i]/10>=0) {
				int a= arr[i]%10;
				sum=sum+a;
				arr[i]=arr[i]/10;
			}
			if(sum%2==0) {
				System.out.print(arr[i]+",");
			}
		}

	}

}
