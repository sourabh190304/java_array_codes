package array_by_shubhangimam;
public class ren_dup_using_sorting {
public static boolean abcd(int a[]) {  
	
	for(int i=0; i<a.length-1; i++) {
		for(int j=0; j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
}
	
return true;

}


	public static void main(String[] args) {
		
		int a[] = {10,10,20,30,20,40,50,50};
	
	
		boolean result=abcd(a);
			System.out.println(result);
		
	}

}
