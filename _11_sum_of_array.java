//sum of all elements in an array

public class _11_sum_of_array {
    


    public static void main(String[] args)
    {
        int sum=0;
        
        int avg=0;
        int array[]={10,20,30,40,50};
        for(int i=0;i<array.length;i++)
        { 
            sum+=array[i];
            avg=sum/array.length;
        }
        System.out.println("sum of array "+sum);
        System.out.println("average of an array element "+avg);


        
    }
    
}
