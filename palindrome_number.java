package array2;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		int size,count=0,sum=0,rem,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("elements of the array:");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			int num=arr[i];
			while(num>0) {
				rem=num%10;
				reverse=reverse*10+rem;
				num=num/10;	
			}	
			if(arr[i]==reverse) {
				System.out.println(arr[i]+" is palindrome");
			}
			reverse=0;
			rem=0;
		}

	}

}
