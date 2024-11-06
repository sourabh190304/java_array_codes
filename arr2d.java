package array_by_shubhangimam;
import java.util.*;
public class arr2d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of 2D array: ");
		//giving size to array
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		
		//decalring new array
		int a[][]= new int[r][c];
		 
		//adding elements in an array
		System.out.println("enter the elements: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		 
		//displaying an array
		System.out.println("display array: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}
}


