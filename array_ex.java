package array_priyanka_mam;
import java.util.*;

//from user array size and elements  and calculate avg and sum 

public class array_ex {
	public static void main(String[] args) {  
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size for array : ");
		
		
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements : ");
		
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array is :");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			System.out.println();
			sum=sum+a[i];
		}
		System.out.println("sum is: "+sum);
		int avg= sum/size;
		System.out.println("avg is: "+avg);

	}
}
