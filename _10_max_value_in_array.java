//find the maximum no in an array

public class _10_max_value_in_array {
    public static void main(String[] args) {
        int arr[]={200,5,10,5,4,22,48,60};
        int max_value=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max_value<arr[i])
            {
                max_value=arr[i];
            }
        }
        System.out.println(max_value);
    }
    
}
