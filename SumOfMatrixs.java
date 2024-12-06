import java.util.Scanner;

public class SumOfMatrixs {

	public static void main(String[] args) {
		
		//Peter Gargas

		
		/*
		 * All empty print statements are for space 
		 * so the user doesn't get confused when entering values 
		 */
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the rows of matrix1: ");
		int mat1_row = key.nextInt();
		
		System.out.println("Enter the number of columns in matrix1: ");
		int mat1_cols = key.nextInt();
		
		System.out.println("");
		
		System.out.println("Enter the rows of matrix2: ");
		int mat2_row = key.nextInt();
		
		System.out.println("Enter the number of columns in matrix2: ");
		int mat2_cols = key.nextInt();
		
		//this is to make sure that the matrixes match and to allow the user to retype the values
		while(mat1_cols != mat2_cols || mat1_row != mat2_row) {
			System.out.println("Dimension mismatch! cannot add the matrices");
			
			System.out.println("Enter the rows of matrix2: ");
			 mat2_row = key.nextInt();
			
			System.out.println("Enter the number of columns in matrix2: ");
			 mat2_cols = key.nextInt();
		}
		
		int[][] matrix1 = new int [mat1_row][mat1_cols];
		int[][] matrix2 = new int [mat2_row][mat2_cols];
		
		System.out.println("");
		
		//taking the user input for matrix 1
		for(int i = 0 ; i <mat1_row; i++) {
			for(int j = 0; j < mat1_cols; j++) {
				System.out.println("Enter the value of the matrix1 at position (" + i + "," + j + "): ");
				
				matrix1[i][j] = key.nextInt();
			}
		}
		
		
		System.out.println("");
		
		//taking the user input for matrix 2 
		for(int i = 0 ; i <mat2_row; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				System.out.println("Enter the value of the matrix2 at position (" + i + "," + j + "): ");
				
				matrix2[i][j] = key.nextInt();
			}
		}
		
		//Adding the two matrixes 
		int[][] sumMatrix = new int [mat1_row][mat2_cols];
		for(int i = 0; i < mat1_row; i++) {
		    for(int j = 0; j < mat1_cols; j++) {
		        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		    }
		}
		
		System.out.println("");

		//Printing the result	
		for(int i = 0; i< mat1_row; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				System.out.print(sumMatrix[i][j]+ " ");;
			}
			System.out.println();
		}

	}
}
