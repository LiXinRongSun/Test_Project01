package indio.lixinrong.oriented.object06;

public class TestString {
    public static void main(String[] args) {
        String str= "";
        long  num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long  num2 = System.currentTimeMillis();//获取当前时间
        for(int i=0; i<5000;i++){
            str =str+ i;


        }
        long num3 = Runtime.getRuntime().freeMemory();
        long num4 = System.currentTimeMillis();
        System.out.println(num1-num3);
        System.out.println(num4-num2);
        StringBuilder stringBuilder = new StringBuilder("");
         long num5 = Runtime.getRuntime().freeMemory();
         long num6 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
           stringBuilder.append(i);

        }
         long num7 = Runtime.getRuntime().freeMemory();
         long num8 =System.currentTimeMillis();
         System.out.println(stringBuilder);
         System.out.println("------------------------------");
         System.out.println(str);
         System.out.println(num5-num7);
         System.out.println(num8-num6);

    }
    
}