package array1;
import java.util.Scanner;
public class EvenOdd_num {

	public static void main(String[] args) {
		int n,count=0,count1=0;
		System.out.println("Emter the size of the array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				count++;
			}else {
				count1++;
			}
		}
		System.out.println("The even number are:"+count);
		System.out.println("The odd number are:"+count1);
	}
}
