package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

class Shopping_details implements Serializable
{
    String itemName;
 int price;
  int quantity;
  Shopping_details(String itemName,int price,int quantity)
  {
    this.itemName=itemName;
    this.price=price;
    this.quantity=quantity;
  }
   public String getitemName()
  {
    return itemName;
  }
  int getprice()
  {
    return price;

  }
  int getquantity()
  {
    return quantity;

  }
} 

 class Serial{
    public static void main(String[] args) {
      try{  File fi=new File("file1.txt");
        FileOutputStream fos=new FileOutputStream(fi);
        ObjectOutputStream os=new ObjectOutputStream(fos);
        Shopping_details m1=new Shopping_details( "bottle",50, 2);
        Shopping_details s1=new Shopping_details("bag", 2500, 1);

        os.writeObject(m1);
        os.writeObject(s1);
        os.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    }

}

class Read_Shopping_details
{
    public static void main(String[] args) {
        try{
            File f=new File("file1.txt");
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream os=new ObjectInputStream(fis);
            Shopping_details m1=(Shopping_details)os.readObject();
            Shopping_details s1=(Shopping_details)os.readObject();

            os.close();
            System.out.println("list of products");
            System.out.println("1st product");
            System.out.println("product of name: "+m1.getitemName());
            System.out.println("prise: "+m1.getprice());
            System.out.println("nquantity: "+m1.getquantity());
            System.out.println("\n2nd product details");
            System.out.println("product_name "+s1.getitemName());
            System.out.println("price "+s1.getprice());
            System.out.println("quantity "+s1.getquantity());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


