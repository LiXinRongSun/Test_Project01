package indio.lixinrong.javasenior.toolclass.datatest;
import java.util.Date;


public class Datatest {
    public static void main(String[] args) {
        long noNum =System.currentTimeMillis();//当前时间对应的毫秒数
        long nonum =System.nanoTime();//当前时间对应的纳秒；
        

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());//data对象创建时的毫秒值；
        Date date2 =new Date(1000L*3600*24*365*100);
        System.out.println(date2);
        System.out.println(date);
        System.out.println(date.toString());
        // boolean after(when) 测试此日期是否在指定日期（When）之后
        // boolean before(when) 是否在指定日期之前   
        boolean a = date.after(date2);
        boolean b = date.before(date2);
        System.out.println(a+","+b);
        //获取当前年份
        System.out.println(date.getYear()+1900);
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());

    }
    
}