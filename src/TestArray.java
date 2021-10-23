import java.util.ArrayList;
import java.util.Iterator;

public class TestArray {
   public static void main(String[] args) {
       ArrayList arrayList =new ArrayList();//创建一个空的集合
       ArrayList arrayList2 =new ArrayList(10);//创建一个指定大小的集合
       arrayList.add("i");
       for(int i=0; i<11; i++){
           arrayList.add(i);
       }
       arrayList.add(4.12);
       arrayList.add(3,444);
        System.out.println( arrayList.get(0));//返回当前索引的元素
        System.out.println(arrayList.contains(1));//列表中是否保存指定的元素
        System.out.println(arrayList.remove("0"));
        System.out.println(arrayList.remove(4.12));
        //输出ArrayList中的所有元素；
        System.out.println(arrayList);
        Iterator it =arrayList.iterator();
        for(Iterator it2 = arrayList.iterator(); it2.hasNext();){
          System.out.println(it2.next());
        }
        /*for(String tmp : arrayList ){
          System.out.println(tmp);

        }*/
        for(int i=0;i<arrayList.size();i++){
          System.out.print(arrayList.get(i)+" ");
        }

       ArrayList arrayList3 =new ArrayList(arrayList);
       System.out.println();
       System.out.println(arrayList.size());
       System.out.println(arrayList2.size());
       System.out.println(arrayList3.size());
     


   }
   public boolean equals(Object obj){
     if(obj == null){return false;//判断传入的对象是否为空
    }if(this == obj ){return true;//判断两个对象的引用是否相同；
    }if(obj instanceof TestArray){//判断传入对象是否属于同一个类或者向上转型过的父类引用；  
       TestArray testArray = (TestArray) obj;
        if(true)//判断属性是否都相等
        { 
        return  true;
        }

        }        
        return false;

      }  
}