package array_by_shubhangimam;

public class unique_pair_array {
	public static void main(String[] args) {
		 int[] array = {1, 2, 3};

	        System.out.println("Unique pairs:");

	        // Loop through the array and generate pairs
	        for (int i = 0; i < array.length; i++)
	        {
	        	//0<3
	        	//1<3
	        	//2<3
	        	//3<3 false
	            for (int j = 0; j < array.length; j++) 
	            	//0<3  0<3 0<3
	            	//1<3  1<3 1<3
	            	//2<3  2<3 2<3
	            	//3<3 false
	 
	            {
	                System.out.println("(" + array[i] + "," + array[j] + ")");
	                // 1,1 1,2 1,3 //3 is printed because we start from zero
	                // 2,1 2,2 2,3 //3 is printed because we start from zero
	                // 3,1 3,2 3,3 //3 is printed because we start from zero
	            }
	        }
	}

}
