package twoDArray;

public class MatrixSum {

	public static void main(String[] args) {
		int[][] matA = {{1,2},{3,4}};
		int[][] matB = {{5,6},{7,8}};
		
		int rows = matA.length;
		int columns = matA[0].length;
		
		int [][] sum = new int [rows] [columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j< columns; j++) {
				sum[i][j] = matA[i][j] + matB[i][j];
			}
		}
		System.out.println("The sum is:");
		for (int[] row: sum) {
			for (int col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
