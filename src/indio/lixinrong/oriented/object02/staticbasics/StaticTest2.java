
package indio.lixinrong.oriented.object02.staticbasics;
/**
 * 这是一个静态初始化练习
 * 构造代码块会在new 对象时执行，执行在构造方法之前
 * 静态代码块在类加载时执行
 * 
 */
public class StaticTest2 {
 static int count = 0;
 {
     int  i=0;
     System.out.println("构造带码块");

 }   
 static {
     
     count++;
     System.out.println("count="+count);
     System.out.println("静态代码块");

 }
 public StaticTest2(){
     System.out.println("空参构造方法");
 }
 public static void main(String[] args){
     StaticTest2 staticTest2 = new StaticTest2();
 }
 {
     System.out.println("ooooo");
 }
}
