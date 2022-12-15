package Matrix;

public class Two {

	public static void main(String[] args) {
		
		int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] arr3 = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr3[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : arr3) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
		// TODO Auto-generated method stub

	}

}
