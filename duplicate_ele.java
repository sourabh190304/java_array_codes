package array_priyanka_mam;

public class duplicate_ele {
	public static void main(String[] args) {


		int a[]= {1,2,1};
		for(int i=0; i<a.length; i++) 
		//0<3 true //1<3 true  //2<3 true //3<3 false
		{
			int cnt=0; //cnt=0 
			for(int j=0; j<i; j++) 
			//0<0 false //0<1 true // 1<2 true // 2<3 
			
			{
				if(a[i]==a[j]) 
				// 0==0
				{
					cnt++; //0 //0 //1 
				}
			}
			if(cnt==0) //cnt=0  print  //cnt=0 print//cnt=1 false not printing 
			{
				System.out.print(a[i]+" ");
			}
		}

	}
}
