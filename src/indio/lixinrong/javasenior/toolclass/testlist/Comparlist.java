package indio.lixinrong.javasenior.toolclass.testlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Comparlist implements Comparable<Comparlist> {
    String name;
       int age;
    public Comparlist(){

    }
    public Comparlist(String name, int age){
        this.name = name;
        this.age  = age;

    }

    public static void main(String[] args) {
        List<Comparlist> list = new ArrayList<>();
        list.add(new Comparlist("李新荣",21));
        list.add(new Comparlist("王哈哈",19));
        list.add(new Comparlist("东哈哈",19));

        System.out.println(list.get(0));
        System.out.println(list);
        
        System.out.println(list.isEmpty());
        Collections.sort(list);
        System.out.println(list);
        Comparator<Comparlist> comparator = new Comparator<Comparlist>(){

			@Override
			public int compare(Comparlist o1, Comparlist o2) {
				// TODO Auto-generated method stub
				return o1.age-o2.age;
			}
            
        };
        list.sort(comparator);
        System.out.println(list);
        
        
    }
	@Override
	public int compareTo(Comparlist o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Comparlist [age=" + age + ", name=" + name + "]";
	}
    
}