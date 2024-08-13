//remove the duplicate element from an array

class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6,7,7,8};
        int temp[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j++] = arr[arr.length - 1]; // Add the last element

        for (int k = 0; k < j; k++) {
            System.out.print(temp[k] + " ");
        }
    }
}



