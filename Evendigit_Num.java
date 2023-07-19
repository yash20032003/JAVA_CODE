package array1;
import java.util.Scanner;
public class Evendigit_Num {

	public static void main(String[] args) {
		int n,sum=0,a;
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the even elements of the array:");
		for(int j=0;j<n;j++) {
			int b=arr[j];
			while(b>0){
				 a=b%10;
				sum=a+sum;
				b=b/10;
			}
		
			if(sum%2==0) {
				
				System.out.println(arr[j]);
			}
			sum=0;
		}
	}

}
