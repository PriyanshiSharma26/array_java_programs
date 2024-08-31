class MatrixMultiplication {

    public static void main(String[] args) {
        // Define two 2x2 matrices
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        
        // Resultant matrix
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        // Display the result
        System.out.println("Resultant Matrix:");
        printMatrix(result);
    }
    
    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[2][2];
        
        // Matrix multiplication logic
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

