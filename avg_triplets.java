package array_priyanka_mam;

public class avg_triplets {
	public static void main(String[] args) {
		int a[]= {3,7,90,20,5,50,40};
		
		byte k=3;
		int index=0;
		int min=Integer.MAX_VALUE;
		
		
		for(int i=0; i<=a.length-k; i++) 
		//0<3 
			
		{
			int sum=0;
			for(int j=i; j<i+k; j++)
				//0<3 1<3 2<3 3<3=false
			
			{
				sum=sum+a[j];
				//sum=0+(add of a[j])=100 
				//sum=0+(add of a[j])=117
				//sum=0+(add of a[j])=115
				//sum=0+(add of a[j])=75
				//sum=0+(add of a[j])=95
				
				System.out.print(a[j]+" ");
			 	//3 7 90 
				//7 90 20
				//90 20 5
				//20 5 50
				
				
			}
			System.out.println(" = "+sum);
			//=100
			//=117
			//=115
			//=75
			//=95
			 
			// min varible got 75
			System.out.println();
			
			
			if(sum<min) 
			{
				min=sum; //75
				index=i;  //3
			}
		}
		System.out.println("min : "+min); //75
		System.out.println();
		System.out.println("avg : "+min/k ); //75/3=25
		System.out.println();
		System.out.println("index : "+index); //[75]=3
		
	}

}
