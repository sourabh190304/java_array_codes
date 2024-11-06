package array_by_shubhangimam;

public class array3d_manually {
	public static void main(String[] args) {
		int a[][][]= 
			//arr
				{
			//set1
				{
				//set1 r/c
					{1,2},{2,3}
				},
				//set2 r/c
				{
					{5,6},{7,8}
				}
				};
		
		int i,j,k;
		System.out.println("sec 1 :");
		System.out.println();
		for(i=0; i<a.length; i++) {
			for(j=0; j<a.length; j++) {
				for(k=0; k<a.length; k++) {
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println(" ");
		}
	}

}
