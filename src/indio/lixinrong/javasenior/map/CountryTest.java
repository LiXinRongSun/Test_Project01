package indio.lixinrong.javasenior.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class CountryTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        for(int i=0; i<2;i++){
            map.put(new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
        }
        map.put("cn","china");
        map.put("usa","USA");
        map.put("bn","britain");
        map.put("Fc","France");
        
        System.out.println(map.size());
        System.out.println(map.get("cn"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        Set<Entry<String,String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        Iterator<Entry<String,String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Entry<String,String> entry : map.entrySet()){
            System.out.println(entry);
        }
    

    }
    
}
