package array_by_shubhangimam;
import java.util.*;
public class arr3d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of 3D array: ");
		//giving size to array
		int r,c,d;
		r=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();

		//decalring new array
		int a[][][]= new int[r][c][d];

		//adding elements in an array
		System.out.println("enter the elements: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				for(int k=0; k<d; k++) {
					a[i][j][k]=sc.nextInt();
				}
			}
		}

		//displaying an array
		System.out.println("display array: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				for(int k=0; k<d; k++) {
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

		int[][][]resultmatrix = new int[r][c][d];
		for(int i=0; i<resultmatrix.length; i++) {

			for (int j=0; j<resultmatrix.length; j++) {
					for(int k=0; k<resultmatrix.length; k++) {
						resultmatrix[i][j][k]=a[i][j][k];
						System.out.print(" "+resultmatrix[i][j][k]);
					}
					System.out.println();
				}
				System.out.println();
			}
		
		int[][][]resultmatrix2 = new int[r][c][d];
		for(int i=0; i<resultmatrix2.length; i++) {

			for (int j=0; j<resultmatrix2.length; j++) {
				
					for(int k=0; k<resultmatrix2.length; k++) {
						resultmatrix2[i][j][k]=resultmatrix[i][j][k]+a[i][j][k];
						System.out.print(" "+resultmatrix2[i][j][k]);
					}
					System.out.println();
				}
				System.out.println();
			}
		
		
	}
}


