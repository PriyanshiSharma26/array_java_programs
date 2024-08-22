//find the minimum no in an array

public class _9_min_value_in_array {
    public static void main(String[] args)
     {  
        int arr[]={10,20,30,40,50,1};
        int min_value=arr[0];

        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]<min_value)
           {
            min_value=arr[i];
           }
        }
        System.out.println("minimum value in an array is: "+min_value);
        
    }
    
}
