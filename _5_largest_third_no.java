//third largest even no in an array

public class _5_largest_third_no {
    public static void main(String[] args) {

        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57,60};
        size = array.length;
        for(int i = 0; i<size; i++ ){
           for(int j = i+1; j<size; j++){
              if(array[i]>array[j]){
                 temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
              }
           }
        }
        System.out.println("Third largest third number is:: "+array[size-3]);
        }
     }
     
