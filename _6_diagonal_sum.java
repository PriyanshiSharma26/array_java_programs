 class DiagonalSums {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[] sums = calculateDiagonalSums(array);
        System.out.println("Sum of primary diagonal: " + sums[0]);
        System.out.println("Sum of secondary diagonal: " + sums[1]);
    }
    
    public static int[] calculateDiagonalSums(int[][] array) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int size = array.length;
        
        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += array[i][i];
            secondaryDiagonalSum += array[i][size - 1 - i];
        }
        
        return new int[]{primaryDiagonalSum, secondaryDiagonalSum};
    }
}

