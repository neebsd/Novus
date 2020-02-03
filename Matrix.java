package Homework;

public class Matrix {
	public static void main(String[] args) {
		int[][] matrix1 = {{2, 1}, {1, 2}};
		int[][] matrix2 = {{1, 2}, {3, 4}};
		int[][] result = new int[matrix1.length][matrix2[0].length];

		multiply(matrix1, matrix2, result);
	}

	public static void multiply(int[][] m1, int[][] m2, int[][] r){
	    for (int i = 0; i < m1.length; i++){
	        for (int j = 0; j < m2[0].length; j++){
	            for (int k = 0; k < m1[0].length; k++){
	                r[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        print(r);
    }

    public static void print(int m[][]){
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
