package indio.lixinrong.oriented.object04.impbasics02;

import java.util.Scanner;

public class TestInterface {
 public static void main(String[] args) {
     String name;
     Scanner sc = new Scanner(System.in);
     SqArtist sqArtist = new SqArtist();
     System.out.println("输入艺人种类");
     if(sc.next().equals("sqartist")){
         System.out.println("请输入艺人姓名");
         name = sc.next();
         System.out.println(name);
         sqArtist.perFiml();
         sqArtist.perTV();
         sqArtist.singer();
     }
     else{
         System.out.println("暂未设定");
     }
 }   
}
