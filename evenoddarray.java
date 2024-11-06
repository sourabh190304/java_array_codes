package array_priyanka_mam;

public class evenoddarray {
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8,9,10,11,12};
		int b[] =new int[a.length]; //a[]=b[]
		int even=0;
		int odd=0;
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else 
			{
				odd++;
			}
		}
		
	}
}
