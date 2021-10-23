package indio.lixinrong.javasenior.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestCopy {
    public static void main(String[] args) throws Exception {
        File file = new File("ab.txt");
        File  file2 = new File("cd.txt");
        file.createNewFile();
        file2.createNewFile();
        File file3 = new File("aa.txt");
        File  file4 = new File("cc.txt");
        file3.createNewFile();
        file4.createNewFile();
        InputStream  fis  = new FileInputStream(file);
        OutputStream os = new FileOutputStream(file2);
        InputStream  fis2  = new FileInputStream(file3);
        OutputStream os2 = new FileOutputStream(file4);
        //缓冲流字节
        BufferedInputStream  bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(os);



        int  count =0;
        int n ;
        long  s1  =System.nanoTime();  
        //System.out.println(fis.read());
        byte[]  buf  = new byte[33333];
        //n = fis.read();// 读取一个字节
        n= bis.read(buf);
        //bos.write(buf, 0, n);
        //n = fis.read(buf);
        while (n != -1){
            count++;
           // os.write(buf,0,n);
              bos.write(buf,0,n);
           // n = fis.read(buf);
              n = bis.read(buf);
        }
        long s2  =  System.nanoTime();
        long s3  =   System.nanoTime();

        
        byte[] buf2 = new byte[2];
        int n2  =   fis2.read(buf2);// n2 是 读了的字节数  没有字节可读时n2 =-1 
        System.out.println(n2);
            os2.write(buf2,0,n2);
        long s4  =   System.nanoTime();

        bis.close();
        bos.close();
        fis.close();
        os.close();
        System.out.println(s2-s1);
        System.out.println(s4-s3);
        System.out.println(count);
    }
    
}
