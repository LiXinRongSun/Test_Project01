package indio.lixinrong.javasenior.file;

import java.io.*;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException  {
        try{
            throw new Exception("参数越界"); 
            //System.out.println("sb");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("异常后");//可以执行

        
      /*   File file = new File("object.txt");
        file.createNewFile();
        OutputStream os = null;
        InputStream is  = null;
        ObjectInputStream iis = null;
        ObjectOutputStream ois = null;
        try {

            os =new FileOutputStream(file);
            is =new FileInputStream(file);
            //iis = new ObjectInputStream(is);
            ois = new ObjectOutputStream(os);

            Student stu  = new Student("asd",12);
            ois.writeObject(stu);
           // ois.writeObject(null);

            Student s =(Student) iis.readObject();
          //  System.out.println(s);
            ois.close();
           // iis.close();
            
        } catch (Exception e) {
            //TODO: handle exception
            
            e.printStackTrace();
            System.out.println("have some Exception");
            
        }finally{
            try {
                if(ois != null){
                    ois.close();
                }
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            try {
                if(iis != null){
                    ois.close();
                }
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            } */
        }
    }

