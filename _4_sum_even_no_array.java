//sum of even no in an array

public class _4_sum_even_no_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
               sum=sum+arr[i];
            }
        }
        System.out.println("sum of even no in an array : "+sum);

    }
    
}
