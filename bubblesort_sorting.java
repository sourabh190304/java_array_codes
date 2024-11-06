package arrays_concepts_hrshi_sir;

public class bubblesort_sorting {
	public static void main(String[] args) {
		int a[]= {1,3,4,2};
		for(int num:a) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int num:a) {
			System.out.print(num+" ");
		}
		
	}

}
