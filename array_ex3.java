package array_priyanka_mam;

//copy array one from another 

public class array_ex3 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int b[]= new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
