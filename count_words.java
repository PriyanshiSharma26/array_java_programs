package filehandling;

import java.io.File;
import java.io.FileInputStream;

public class count_words {
    public static void main(String[] args)
    {
    String filename="file.txt";
    
    
    try{
        File f1=new File(filename);
        FileInputStream fis=new FileInputStream(f1);
        int count=0;
        int wordLength=0;
        while(true)

            {
                int x=fis.read();
                String data=" ";
                if(x==-1)
                break;
                else if(x==' '||x=='.')
                { 
                    count++;
                    data=data+(char)x;
                }
            }
            System.out.println("count of words are: "+count);
        

                
            }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            
        // for(int i=)
             
        
    
}



        
    }
    

