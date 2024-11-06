package array_priyanka_mam;

import java.util.Scanner;

public class TwoDArrayAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows and columns for the arrays
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize two 2D arrays and a result array for storing the sum
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input elements for the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        // Add the two arrays and store the result in the result array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Display the result array
        System.out.println("The resulting array after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();  // New line for each row
        }
    }
}
