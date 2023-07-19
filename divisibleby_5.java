package array;

import java.util.Scanner;

public class divisibleby_5 {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int arr[]= new int[size] ;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("The number divisible by 5 are :");
		for(int i=0;i<size;i++) {
			if(arr[i]%5==0) {
			System.out.print(arr[i]+",");
		}
	}
	}

}
