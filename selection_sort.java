package arrays_concepts_hrshi_sir;

public class selection_sort {
	public static void main(String[] args) {

		int a[]= {4,2,3,1};
		for(int i=0; i<a.length; i++) 
		//4<3
		{
			int min=i; //min= 4
			
			for(int j=i+1; j<a.length; j++) //2<3
			
			{
				if(a[min]>a[j])  
				{
					min=j;
				}
			}
			int temp=a[i]; 
			a[i]=a[min];
			a[min]=temp;


		}
		for(int num:a) {
			System.out.print(num+" ");
		}
		//System.out.println();
	}

}
