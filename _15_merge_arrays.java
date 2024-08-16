//mergew two arrays

public class _15_merge_arrays {
    public static void main(String[] args) 
    {
        int a[]={10,20,30,40,50};
        int b[]={60,70,80,90,100};
        int a_length=a.length;
        int b_length=b.length;
        int c_length=a_length+b_length;
        int c[]=new int[c_length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[a.length+i]=b[i];

        }
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]+" ");
        }
    }
    
}
