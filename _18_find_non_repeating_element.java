//to find non repeating element in an array

public class _18_find_non_repeating_element {
    public static void main(String[] args) {
        int array[]= {2, 3, 5, 2, 5, 7, 9, 7, 9,11};
        int length = array.length;

        // Iterate through each element in the array
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;

            // Check if the current element is repeated elsewhere
            for (int j = 0; j < length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.println("Non-repeating element: " + array[i]);
            }
        }
    }
}

        
    
    

