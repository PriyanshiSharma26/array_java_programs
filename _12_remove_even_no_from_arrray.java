public class _12_remove_even_no_from_arrray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int len=arr.length;
        int temparr[]=new int[len];
        int newLength=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                temparr[newLength]=arr[i];
                newLength++;
                
            }

        }
        int newArr[]=new int[newLength];
         System.out.println("array after removing even no");
        for(int i=0;i<newLength;i++)
        {
            newArr[i]=temparr[i];
            System.out.println(newArr[i]);
        }
    }
    
}



//remove odd no from array

class remove_odd
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int len=arr.length;
        int temparr[]=new int[len];
        int newLength=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                temparr[newLength]=arr[i];
                newLength++;
                
            }

        }
        int newArr[]=new int[newLength];
         System.out.println("array after removing even no");
        for(int i=0;i<newLength;i++)
        {
            newArr[i]=temparr[i];
            System.out.println(newArr[i]);
        }
    }
}


//count even no in an array

class count_even
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
        if (a[i]%2==0)
        {
            count++;
        }
    }
    System.out.println("count of even no "+count);

        
    }
}
    


class count_odd
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
        if (a[i]%2!=0)
        {
            count++;
        }
    }
    System.out.println("count of odd no "+count);

        
    }
}
    
