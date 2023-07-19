package array1;
import java.util.Scanner;

 public class min_element {

	public static void main(String[] args) {
				int n;
				System.out.println("enter the sze of the array:");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				int arr[]= new int[n];
				System.out.println("enter the array elements:");
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				int min = arr[0];
				for(int i=0;i<n;i++) {
					if(min>arr[i]) {
						min=arr[i];
					}
					}
				System.out.println("The  minimum value is :"+min);

		}

	}


