package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

class Manager implements Serializable
{
   transient String name;
 int id;
  int age;
  Manager(String name,int id,int age)
  {
    this.name=name;
    this.id=id;
    this.age=age;
  }
   public String getName()
  {
    return name;
  }
  int getId()
  {
    return id;

  }
  int getAge()
  {
    return age;

  }
} 

public class SerializableEx{
    public static void main(String[] args) {
      try{  File fi=new File("Student.txt");
        FileOutputStream fos=new FileOutputStream(fi);
        ObjectOutputStream os=new ObjectOutputStream(fos);
        Manager m1=new Manager("Shivang",123, 24);
        os.writeObject(m1);
        os.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    }

}

class Deserializable
{
    public static void main(String[] args) {
        try{
            File f=new File("Student.txt");
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream os=new ObjectInputStream(fis);
            Manager m1=(Manager)os.readObject();
            os.close();
            System.out.println("Deserialization.....");
            System.out.println(m1.getName());
            System.out.println(m1.getAge());
            System.out.println(m1.getId());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

