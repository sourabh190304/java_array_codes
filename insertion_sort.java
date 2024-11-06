package arrays_concepts_hrshi_sir;

public class insertion_sort {
	public static void main(String[] args) 
	{
		int arr[]= {3,4,2,1};
		System.out.print("before insertion sort :");
		for(int num: arr)
		{
			System.out.print(num+" ");
		}
		
		for(int i=1 ; i<arr.length; i++)
		{
			
			int j=i;
			int temp=arr[i];
			
			while(j>0 && arr[j-1] > temp)
			{
				arr[j]=arr[j-1];
				j--;	
			}
			arr[j]=temp;
		}
		System.out.println();
		for(int num: arr)
		{
			System.out.print(num+" ");
		}
	}
}
