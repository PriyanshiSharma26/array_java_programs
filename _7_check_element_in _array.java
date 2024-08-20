//to check element bis present in an array or not

 class _7_check_element_in_array {
    public static void main(String[] args)
     {
        boolean found=false;
        int target=30;
       int array[]={5,10,15,20,25,30};
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==target)
            {
               found=true;
               break;
            }
        }
        if(found)
        {
            System.out.println( target+" is present in an array");
        }
        else{
            System.out.println(target+" is not present in an array");
        }


    }
    
}
