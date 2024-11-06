 package arrays_concepts_hrshi_sir;
public class array_incdec {
	public static void main(String[] args) {
		int arr[]= {3,1,2};                          //decalre array
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {                  //inc > dec <
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		for(int num:arr) {                          // for each
			System.out.print(num+" ");
		}
	}

}
