package array_priyanka_mam;

public class maxelein2d {
	public static void main(String[] args) {
		
				int max=Integer.MIN_VALUE;
				int a[][]= {
						{12,23},
						{45,67}
				};
				for(int i=0; i<a.length; i++) {
					for(int j=0; j<a.length; j++)
					{
						if(max<a[i][j]) {
							max=a[i][j];
						}
					}
				}
				System.out.println("max ele in 2d: "+max);
	}}	


