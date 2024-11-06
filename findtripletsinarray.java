package array_priyanka_mam;

public class findtripletsinarray {
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		byte num=9;
		
		for(int i=0; i<a.length; i++)//0<5 1<5 2<5 3<5 4<5
		{
			
			for(int j=i+1; j<a.length; j++) // 1<5  
			
			{
				for(int k=j+1; k<a.length; k++) //2<5 
				
				{
					if(a[i]+a[j]+a[k]<num) {
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}}
			}
		}
	}

}
