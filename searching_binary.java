package arrays_concepts_hrshi_sir;

public class searching_binary {
	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15};
		int ele=100;
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end) {
		if(ele<arr[mid]) {
			end=mid-1;
		}
		else if(ele==arr[mid]) {
			System.out.println("elements is found at: "+mid);
			break;
		}
		else {
			start=mid+1;
		}
		mid= (start+end)/2;
		}
		if(start >= end) {
			System.out.println("element is not found in 11-15");
		}
	}

}
