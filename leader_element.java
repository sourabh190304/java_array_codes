package array_priyanka_mam;

public class leader_element {
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,1};
		for(int i=0; i<a.length; i++) // 1<6 2<6 3<6 4<6 5<6
			//1<6 2<6 3<6 4<6 5<6
			//1<6 2<6 3<6 4<6 5<6
			//1<6 2<6 3<6 4<6 5<6
			//1<6 2<6 3<6 4<6 5<6
		{
			int cnt=0;
			for(int j=i+1; j< a.length; j++) // 2<6 3<6 4<6 5<6
				// 2<6 3<6 4<6 5<6
				// 2<6 3<6 4<6 5<6
				// 2<6 3<6 4<6 5<6
				// 2<6 3<6 4<6 5<6
			{
				if(a[i] < a[j]) // 1<2  1<3 1<4 1<5
					// 2<3 2<4 2<5
					// 3<4 3<5
					// 4<5
					// 5<5 false
					// no more comparision for 1
				{
					cnt++; //1,2,3,4 //1,2,3 //1,2 //1 //0 true //0 true
				}
			}
			if(cnt==0)//5 print //1 print
			{
				System.out.print(+a[i]+" "); //5,1
			}
		}
	}
}
