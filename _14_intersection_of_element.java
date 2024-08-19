// retrieve common element in both array

public class _14_intersection_of_element {
    public static void main(String[] args) {
        int a[]={4,6,7,3,8};
        int b[]={2,5,4,6,9};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println("intersection of an array :" + a[i]+" ");
                }
            }
        }

    }
    
}
