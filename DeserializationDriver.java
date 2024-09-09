package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDriver {
  

    public static void main(String[] args) {
        try{
            File f=new File("Student.txt");
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream os=new ObjectInputStream(fis);
            Manager m=(Manager)os.readObject();
            os.close();
            System.out.println("Deserialization.....");
            System.out.println(m.getName());
            System.out.println(m.getAge());
            System.out.println(m.getId());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

  
    

    

