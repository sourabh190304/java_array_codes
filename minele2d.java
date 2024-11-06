package array_priyanka_mam;

public class minele2d {
	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int a[][]= {
				{12,23},
				{45,67}
		};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++)
			{
				if(min>a[i][j]) {
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
