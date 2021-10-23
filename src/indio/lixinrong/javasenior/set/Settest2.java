package indio.lixinrong.javasenior.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.management.InstanceNotFoundException;



public class Settest2 {
    public static void main(final String[] args) {
        Set<Students> set = new LinkedHashSet<Students>();
        //Set<Students> set  = new TreeSet<>();
        Students students = new Students(2,"李新荣",21,99);
        Students students2 = new Students(3,"王二",25,33);
        System.out.println(students);
        set.add(students);
        set.add(students2);
        set.add(new Students(1,"姜东浩",24,59));
        //两个对象的哈希值不同；
        System.out.println(new Students(1,"姜东浩",24,59).hashCode());
        System.out.println(new Students(1,"姜东浩",24,59).hashCode());
        set.add(new Students(1,"姜东浩",24,59));
        System.out.println("adb".hashCode());
        System.out.println(set);
         String str ="24";
         Object object = new Object();
         boolean b =  str instanceof Object;
         boolean f = students instanceof Set;
         System.out.println(b+" "+f);
         
    }
}