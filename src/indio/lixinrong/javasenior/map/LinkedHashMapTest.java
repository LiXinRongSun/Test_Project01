package indio.lixinrong.javasenior.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
        Student student1 = new Student(2018117203, "李新荣", 22, "男");
        Student student2 = new Student(2018117202, "张新荣", 21, "男");
        Student student3 = new Student(2018117003, "王新荣", 21, "男");
        Student student4 = new Student(2018117002, "白新荣", 21, "男");
        
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        map.put(student4.getId(), student4);
        System.out.println(map.containsKey(2018));
        System.out.println(map.containsValue(2018117203));
        System.out.println(map);
        //iterator 迭代器   
        Set<Entry<Integer,Student>> set = map.entrySet();
        Iterator<Entry<Integer,Student>> it = set.iterator();
        Iterator<Entry<Integer,Student>>  it2 =map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
       
        }
        System.out.println(map.keySet());//返回所有健的元素

        System.out.println(map.values());//返回所有值元素；
        System.out.println(map.get(220));
        Set<Integer>keySet =map.keySet();
        
        for(Integer integer:keySet){
            System.out.println(integer+"" +map.get(integer));
        }
       /* Comparator comparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getId()-o2.getId();
            }
            
        };*/
        //set.sort(comparator);
    }
    
}