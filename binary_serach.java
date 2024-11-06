package arrays_concepts_hrshi_sir;

public class binary_serach {
	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		
		int ele=33;
		int start=0;
		int end=a.length-1;
		int mid=(start+end)/2;
		
		while(start <= end) {
			if(ele <a[mid]) {
				start=mid-1;
			}else if(ele == a[mid]) {
				System.out.println("ele found at position: "+mid);
				break;
				
			}else {
				start=mid+1;
			}
			mid=(start+end)/2;
			
		}
		if(start >= end) {
			System.out.println("default ele found");
		}
		
	}

}
