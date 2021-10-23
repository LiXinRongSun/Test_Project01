package indio.lixinrong.javasenior.toolclass.datatest;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDataFormat {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
          
          String  daytime =simpleDateFormat.format(new Date());
          System.out.println(daytime);
          System.out.println(simpleDateFormat2.format(new Date()));
          System.out.println(simpleDateFormat2.format(new Date()));
          System.out.println(simpleDateFormat2);
          String time = "2003-10-9 19:23:23";
          Date date=null;
          System.out.println(date);
          try {
              date = simpleDateFormat2.parse(time);
              System.out.println(System.identityHashCode(date));
              System.out.println(date);
          } catch (ParseException e ) {
              // TODO Auto-generated catch block
              e.printStackTrace();
              System.out.println(e);
          }finally{
              
          }

          Date date1 =null;
          Date data;
          data = new Date();
System.out.println("date:"+date);
System.out.println(System.identityHashCode(date));
System.out.println("date:"+date1);

        }
    
}