import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the rows of matrix1: ");
		int mat1_row = key.nextInt();
		
		System.out.println("Enter the number of columns in matrix1: ");
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the rows of matrix2: ");
		int mat2_row = key.nextInt();
		
		if(mat1_cols != mat2_row) {
			System.out.println("Dimension mismatch! cannot multiply the matrices");
			System.exit(0);
		}
		
		System.out.println("Enter the number of columns in matrix2: ");
		int mat2_cols = key.nextInt();
		
		// creat 2 martices
		
		int[][] matrix1 = new int [mat1_row][mat1_cols];
		int[][] matrix2 = new int [mat2_row][mat2_cols];
		
		for(int i = 0 ; i <mat1_row; i++) {
			for(int j = 0; j < mat1_cols; j++) {
				System.out.println("Enter the value of the matrix1 at position (" + i + "," + j + "): ");
				
				matrix1[i][j] = key.nextInt();
			}
		}
		
		
		for(int i = 0 ; i <mat2_row; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				System.out.println("Enter the value of the matrix2 at position (" + i + "," + j + "): ");
				
				matrix2[i][j] = key.nextInt();
			}
		}
		
		//Matrix multiplication
		int[][] productMatrix = new int [mat1_row][mat2_cols];
		int sum = 0;
		for(int i = 0; i < mat1_row; i++) {
			 
			for(int j = 0; j < mat2_cols; j++) {
				
				for(int k =0; k < mat1_cols; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				productMatrix [i][j] = sum;
				sum = 0;	
			}
			
		}
		
		//print the product matrix
		for(int i = 0; i< mat1_row; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				System.out.print(productMatrix[i][j]+ " ");;
			}
			System.out.println();
		}
		
	}

}
