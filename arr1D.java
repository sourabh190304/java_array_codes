package array_by_shubhangimam;
import java.util.*;
public class arr1D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<a.length; i++){
			a[i]=sc.nextInt();
		}
		System.out.print("display array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}
}


