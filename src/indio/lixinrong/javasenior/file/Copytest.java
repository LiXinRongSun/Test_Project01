package indio.lixinrong.javasenior.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Copytest {
    public static void main(String[] args)  {
        File file = new File("aa.txt");
        File file2 = new File("ab.txt");
        InputStream  in = null;
        OutputStream out = null;
        try {
               in = new FileInputStream(file);
               out = new FileOutputStream(file2); 
               
               int n = in.read();
               while (n>0) {
                   out.write(n);
                   n = in.read();
                   System.out.println(n);

               }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }


    }
    
}
