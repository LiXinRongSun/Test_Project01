package indio.lixinrong.javasenior.toolclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 这是一个关于collections 类方法的测试 collections 类专门用来操作集合类，提供一些静态方法实现对集合的搜索排序线程安全化等操作
 * 
 */
public class CollectionTest {
public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    Collections.addAll(list, 10,15,34);
    // 排序按照内部比较器进行比较
    Collections.sort(list);
    // 查找元素 （元素必须是有序的）
    System.out.println(Collections.binarySearch(list, 15));
    // 获取最大最小值
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));

    //填充集合
    Collections.fill(list, null);
    System.out.println(list);
     
    //复制集合
    List list2 = new ArrayList<>();
    Collections.addAll(list2, 10,15,23);
    Collections.copy(list, list2);
    System.out.println(list);
        

}    
}