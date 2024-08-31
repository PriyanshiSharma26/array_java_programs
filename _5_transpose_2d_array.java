class Transpose2DArray {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] transposed = transpose(array);
        
        System.out.println("Transposed Array:");
        printArray(transposed);
    }
    
    public static int[][] transpose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        
        return transposed;
    }
    
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

