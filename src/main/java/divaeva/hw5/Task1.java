package divaeva.hw5;

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(4, 3);
        printMatrix(matrix);
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int matrixValue = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = matrixValue++;
                } else {
                    matrix[i][j] = -1 * matrixValue++;
                }
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
