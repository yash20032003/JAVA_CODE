package array2;
import java.util.Scanner;
public class prime_number {

	public static void main(String[] args) {
		int size,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("elements of the array:");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0)
				{
					count++;
				}
				
			}
			if(count==2) {
				System.out.print(arr[i]+",");
			}
			count=0;
		}

	}

}
