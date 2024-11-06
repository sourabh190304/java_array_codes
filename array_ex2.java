package array_priyanka_mam;

//replace one at place of zero

public class array_ex2 {
public static void main(String[] args) {
	int a[]= {1,0,1,0,1,0};
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
		if(a[i]==0) {
			a[i]=1;
		}
	}
	System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
}
}
