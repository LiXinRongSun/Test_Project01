package indio.lixinrong.javasenior.toolclass.testlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListTest {
  
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<String>();  
        BufferedReader reader = new BufferedReader(new FileReader(new File("testlist.txt")));
        String line = reader.readLine();
       
        while(line != null){

          list.add(line);
          line = reader.readLine();
         
        }

       System.out.println(list.get(new Random().nextInt(list.size())));
       for(String str : list){
         System.out.println(str);
       }
       Iterator<String> iterator = list.iterator();
       while(iterator.hasNext()){
         System.out.println(iterator.next());
       }
    }
    
}
