package arrays_concepts_hrshi_sir;

public class reverse_array 
{
	public static void main(String[] args) 
	{
		int number[] = {11,22,33,44,55}; //create an array
		{
			int start = 0;               //start=0
			int end = number.length-1;   //end=4
			while(start< end) {
				int temp= number[start];            //temp=0
				number[start]=number[end];          //start=4
				number[end]=temp;                   //end=0
				start++;                            //start++
				end--;                              //end--
			}
			for(int i=0; i<number.length ; i++) 
			{
				System.out.print(number[i]+" ");      //print array
			}
			
			System.out.println();
			System.out.println();
			
			for(int i=number.length-1; i>=0 ; i--) 
			{
				System.out.print(number[i]+" ");      //print array
			}
			
			

		}
	}

}
