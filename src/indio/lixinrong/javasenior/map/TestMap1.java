package indio.lixinrong.javasenior.map;


import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TestMap1 {
    public static void main(String[] args) {
        Map<Integer,Student> map =new TreeMap<Integer,Student>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o2-o1;
            }
            
        });
        Student student1 = new Student(2018117203, "李新荣", 22, "男");
        Student student2 = new Student(2018117202, "张新荣", 21, "男");
        Student student3 = new Student(2018117003, "王新荣", 21, "男");
        Student student4 = new Student(2018117002, "白新荣", 21, "男");
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        map.put(student4.getId(), student4);
        System.out.println(map);
        Set <Integer> set  =map.keySet();
        for(Integer integer: set){
            System.out.println(integer+"--->"+map.get(integer));
            
        }
        // map.entrySet();返回值是一个set 类型的集合，Entry<Integer, Student>是该集合的数据类型是对Map集合键值对的封装；
        Set<Entry<Integer,Student>> set1 =map.entrySet();
        for(Entry<Integer,Student> sEntry :set1){
            System.out.println(sEntry.getValue());
        }
    
}}