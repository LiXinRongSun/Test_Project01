package indio.lixinrong.javasenior.toolclass.calendertest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;;

public class TestCalendar {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println("______________");
        System.out.println(calendar);
        
        System.out.println(calendar.getTime());//获取当前时间
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK) - 1);
        
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);
        System.out.println(gregorianCalendar.getTime());
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        gregorianCalendar.set(Calendar.YEAR, 2099);
        gregorianCalendar.add(Calendar.MONTH, 12);
        Date date = gregorianCalendar.getTime();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = "2022-12-13 23:23:12";
        Date date1=null;
        try {
             date1 = simpleDateFormat.parse(time);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(date1);
        int a=89;
        int b=43;
        int c=97;
        int d = Math.max(Math.max(a, b), c);
        System.out.println(d);
    }
    
}