package indio.lixinrong.javasenior.toolclass.mathtest;

import java.util.Random;

// import jdk.internal.cmm.SystemResourcePressureImpl;
// import sun.awt.AWTAccessor.SystemColorAccessor;

/**
 * Math 数学类
 * Math 的构造函数是 private 的所以不能在其它类中创建对象
 * Math 中的许多方法都是静态的所以可以直接通过 Math 类名调用；
 */
public class TestMath {
    public static void main(String[] args) {
        int a = 989;
        int b =32;
        double c = 1032.34;
        double d = -13234.324;
        System.out.println(Math.min(Math.min(c, b), a));
        System.out.println(Math.max(Math.max(c, b), a));
        System.out.println(Math.abs(d));//求绝对值
        System.out.println(Math.ceil(c));//向上取值
        System.out.println(Math.round(c));//四舍五入取整 返回值是 long  型
        System.out.println(Math.floor(c)); //向下取值
        System.out.println(Math.sqrt(c));//求开平方
        System.out.println(Math.pow(d, 2));//求幂
        double f = Math.pow(d, 2);
        Random random = new Random();
        System.out.println( random.nextInt(11)+10);
        int R= Integer.parseInt("1122");
        String sv =String.valueOf(44.5);
        System.out.printf("%s %s",R,sv);

    }
}