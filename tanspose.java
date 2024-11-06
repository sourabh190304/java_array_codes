package array_priyanka_mam;

public class tanspose {
	public static void main(String[] args) {
		
		byte a[][]= {{1,2},{3,4}};
		System.out.println("before transpose : ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
		
		System.out.println();
		
		System.out.println("after transpose : ");
		
		for(int i=0; i<a.length; i++)// 0<2 1<2
		
		{
			for(int j=0; j<a.length; j++) 
				//0<2 1<2
			
			{
				System.out.print(a[j][i]+" ");
				//1 //2 //3 //4 
				}
			System.out.println();
			}
		}

}
