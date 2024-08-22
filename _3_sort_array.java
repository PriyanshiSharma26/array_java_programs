//sorting of an array in ascending order

 class _3_sort_array {
    public static void main(String[] args) 
    {
        
        int[] no={3,7,2,9,5,4,6};
        System.out.println("original array is ");
        for(int i=0;i<no.length;i++)
        {
            System.out.print(no[i]+" ");
        }
        
        for(int i=0; i<no.length; i++)
        {
            for(int j=i+1; j<no.length; j++)
            {
                if(no[i]>no[j])
                {
                    int temp=no[i];
                    no[i]=no[j];
                    no[j]=temp;        
                }

            } 
        }
        System.out.println("\n\n array is sort in ascending order");
        for(int i=0;i<no.length;i++)
        {
            System.out.print(no[i]+" ");
        }
    }
    
}


//sorting an array in descending order

class sort_descending_array
{
    public static void main(String[] args)
     {
        int arr[]={10,20,30,40,50};
        System.out.println("original array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(" \n\n array is sort in descending order");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}



//check the array is in ascending order or not


class check_order
{
    public static void main(String[] args) {
        int arr[]={2,3,4,3};
        boolean check=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                check=false;
            }        
                        
        }
    }
        if(check)
        {
            System.out.println("the array is in ascending order");
        }
        else{
            System.out.println("array is not in order");
        }
    }
}

//check the array is in descending order or not


class check_order2
{
    public static void main(String[] args) {

        int arr[]={5,4,3,2,1};
        boolean check=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    check=false;
                }
            }
        }
        if(check)
        {
            System.out.println("the array is in descending order");
        }
        else{
            System.out.println("array is not in descending order");
        }


        
    }
}
