package array_priyanka_mam;

public class mineleinarray {
	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		
		int a[]= {1,2,3,4,5};
		
		
		for(int i=0; i<a.length; i++)//0<5 1<5 2<5 3<5 4<5 
			
		{
			if(a[i]<min)// 1<216543 
			{
				min=a[i]; //1
			}
		}
		System.out.println("min ele is: "+min); //so last is 
												// min ele is 1
	}

}
