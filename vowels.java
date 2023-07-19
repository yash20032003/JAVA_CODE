package array;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		char arr[]= new char[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character ");
		for(int i=0;i<7;i++) {
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("Vowels are:");
		for(int i=0;i<7;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println(arr[i]);
			}
		}
	}

}
