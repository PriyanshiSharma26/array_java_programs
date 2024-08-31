 class MaxValueIn2DArray {

    public static void main(String[] args) {
        int[][] array = {
            {1, 5, 3},
            {4, 7, 2},
            {8, 6, 9}
        };
        
        int max = findMaxValue(array);
        System.out.println("The maximum value in the 2D array is: " + max);
    }
    
    public static int findMaxValue(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}

