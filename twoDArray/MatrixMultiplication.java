package twoDArray;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int matA[][]={{12,11,14},{13,17,10}};
        int matB[][]={{16,19},{23,22},{10,11}};
        int commonIndex =matB.length;
        int rows=matA.length;
        int columns = matB[0].length;
        int matMul[][]=new int [rows][columns];
        for(int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matMul[i][j]=0;
                for (int k=0; k<commonIndex; k++){
                    matMul[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        System.out.println("After Multiplication");
        for(int row[]:matMul){
            for (int col:row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
		
		
	}

}
