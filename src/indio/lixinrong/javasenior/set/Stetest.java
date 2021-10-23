package indio.lixinrong.javasenior.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// import jdk.nashorn.internal.ir.WhileNode;
// import sun.print.resources.serviceui;

public class Stetest  implements Comparable<Stetest>{
    private   String  name;
    public Stetest(){

    }
    public Stetest(String name){
        this.name = name;

    }
    public String  getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
        public static void main(String[] args) {
        Set<Integer> set  = new HashSet<>();
        set.add(78);
        set.add(65);
        set.add(56);
        set.add(34);
        set.add(345);
        set.add(78);
        System.out.println(set);
        Set<String> set2 = new TreeSet<>();
        
        set2.add("HTML");
         set2.add("Java");
        set2.add("Oracle");
       
        set2.add(new String("java"));
        //输出课程
        System.out.println(set2.size());
        System.out.println(set2);
        //
        Set<Stetest> set3 = new TreeSet<>();
        set3.add(new Stetest("李新荣"));
        set3.add(new Stetest("王新荣"));
        set3.add(new Stetest("张新荣"));
        System.out.println(set3);
        //遍历集合
        for(Stetest stetest : set3){
            System.out.println(stetest);
        }
        Iterator<Stetest> iterator = set3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }       
        
        //遍历集合
        Iterator<String> it =set2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        Set set4  =  new  HashSet<>();
        
        set4.add(2343);
        set4.add("sdes");
        set4.add(4.23);
        set4.add(true);
        System.out.println(set4);
        
        for(Object object :set4){
            System.out.println(object);
        }
        
        for(Iterator iterator2 = set4.iterator();iterator2.hasNext();){
            System.out.println(iterator2.next());
            iterator2.remove();//删除被迭代器遍历过的元素
        }
        System.out.println(set4.isEmpty());//判断集合是否为空
        }
        
    }

    @Override
    public int compareTo(Stetest o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Stetest [name=" + name + "]";
    }

    
}