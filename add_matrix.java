package array_priyanka_mam;

public class add_matrix {
	public static void main(String[] args) {

		//m1
		int[][] matrix={
				{2,2},
				{3,3} };

		//m2
		int[][] matrix2={
				{2,3},
				{3,2} };

		//print m1
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		//print m2
		System.out.println();
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}


		System.out.println();

		//printing addition of m1&m2
		int[][]resultmatrix =new int[2][2];
		for (int i = 0; i < resultmatrix.length; i++) {

			for (int j = 0; j < resultmatrix.length; j++) {
				resultmatrix[i][j]=matrix[i][j]+matrix2[i][j];
				System.out.print(resultmatrix[i][j]+ " ");
			}

			System.out.println();
		}







	}

}
