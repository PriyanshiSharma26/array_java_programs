 class UnionOfArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = {50, 70, 80, 90, 100};

        // Step 1: Merge the arrays
        int a_length = a.length;
        int b_length = b.length;
        int c_length = a_length + b_length;
        int c[] = new int[c_length];

        // Copy elements of array 'a' to 'c'
        int size = 0;
        for (int i = 0; i < a_length; i++) {
            c[size++] = a[i];
        }

        // Copy elements of array 'b' to 'c'
        for (int i = 0; i < b_length; i++) {
            c[size++] = b[i];
        }

        // Step 2: Remove duplicates from the merged array
        // The size now is the length of the merged array
        int uniqueSize = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            // Check if the current element is a duplicate
            for (int j = 0; j < uniqueSize; j++) {
                if (c[i] == c[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add it to the result array
            if (!isDuplicate) {
                c[uniqueSize++] = c[i];
            }
        }

        // Print the union of the arrays
        System.out.println("Union of the arrays:");
        for (int i = 0; i < uniqueSize; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
