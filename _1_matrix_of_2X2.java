import java.util.Scanner;
 class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array with the specified dimensions
        int[][] array = new int[rows][cols];

        // Take input from the user to fill the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Element "+ i+j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}

