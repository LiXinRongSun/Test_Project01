package indio.lixinrong.oriented.object02;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
/**
 * 静态方法不能直接调用 非静态常量（new对象时才执行）
 */
public class BookTest {
    int a=100;
    static int b=100; 
    public static void main(String[] args) {
        BookTest bookTest =new BookTest();
        System.out.println(bookTest.a);
        Book book =new Book("鹿鼎记","金庸","人名出版社",12.3);
        Book book2= new Book();
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要保存的书名");
        book2.setName(sc.next());
        System.out.println("输入作者名");
        book2.setAuthor(sc.next());
        System.out.println("输入出版社");
        book2.setPress(sc.next());
        System.out.println("输入价格");
        book2.setPrice(sc.nextDouble());
        System.out.println(book);
        System.out.println(book2);
        System.out.println(bookTest.sace());
    }

    public int sace(){
        int       a=1;
        return  a;

    }
    
}