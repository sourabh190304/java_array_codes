package array_priyanka_mam;

public class maxeleinarray {
	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		
		int a[]= {12,23,34,45,56};
		
		
		for(int i=0; i<a.length; i++)//0<5 1<5 2<5 3<5 4<5 
			
		{
			if(a[i]>max)//12>-2165423 23>12 34>23 45>34 56>45
			{
				max=a[i]; //max= //-213464 //12 //23 //34 //45 //56
			}
		}
		System.out.println("MAX ELE IS: "+max); //so last is 
												// max ele is 56
	}

}
