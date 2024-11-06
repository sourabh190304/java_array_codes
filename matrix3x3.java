package array_priyanka_mam;

public class matrix3x3 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int even=0;
		int odd=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even+" "+odd);
		
		int index=0;
		int eve[]=new int[even];
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
			eve[index]=a[i];
			index++;
			}
		}
		for(int i=0; i<even; i++) {
				System.out.println(eve[i]+" ");
			}
			System.out.println();
			
			//odd
			int index1=0;
			int od[]=new int[odd];
			for(int i=0; i<a.length; i++) {
				if(a[i]%2!=0) {
				od[index1]=a[i];
				index1++;
				}
			}
			for(int i=0; i<odd; i++) {
					System.out.println(od[i]+" ");
				}
				System.out.println();
		}
	}

