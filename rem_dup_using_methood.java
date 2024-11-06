package array_by_shubhangimam;
public class rem_dup_using_methood {
	public static int remove(int a[],int n) {
	int j=0;
	for(int i=0; i<n-1; i++) {
		if(a[i]!=a[i+1]) {
			a[j]=a[i];
			j++;
		}
		
	}
	a[j]=a[n-1];
	return j;
	}
public static void main(String[] args) {
		int a[]= {10,10,20,30,40,50};
		int n=a.length;
		
		 n=remove(a,n);
		  
		for(int i=0; i<=n; i++) 
		{
		System.out.print(a[i]+ " ");
		}
}
}
