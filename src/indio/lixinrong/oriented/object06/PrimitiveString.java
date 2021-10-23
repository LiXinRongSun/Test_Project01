package indio.lixinrong.oriented.object06;
/**
 * String 类型和 基本数据类型的互转
*/
public class PrimitiveString {
    public static void main(String[] args) {
        String intStr = "123321234";
        //将字符串转为 基本数据类 使用 包装类 调用 parse()方法；
        int it = Integer.parseInt(intStr);
        System.out.println(it);
        float ft = Float.parseFloat(intStr);
        System.out.println(ft);
        //将基本数据类型转为 字符串 使用 String 调用 valueOf();方法
        String  ftStr = String.valueOf(3.334f);
        String  dbStr = String.valueOf(3.3334);
        //valueOf(数据类型 常量)  return 包装类.toString(常量)
        System.out.println(Double.toString(it));
        Float ft2 = Float.valueOf(24353);
        System.out.println(ft2);
        System.out.println(ftStr);
        System.out.println(dbStr);
        String  boolStr = String.valueOf(true);
        System.out.println(boolStr);
        //toUpperCase()方法将字符串转为大写将字符串
        System.out.println(boolStr.toUpperCase());
        System.out.println( intStr.startsWith("1"));  
        System.out.println(intStr.substring(4,6));
        System.out.println(intStr.indexOf("2"));
        System.out.println(intStr.lastIndexOf("2"));
        System.out.println(intStr.substring(intStr.length()-1));
        System.out.println(intStr.replace("2","3" ));
        StringBuffer stringBuffer =new StringBuffer("12132");
        stringBuffer.append("aad");//将字符串追加到str缓存中
        stringBuffer.insert(2, "2ew");//指定位置加入字符串
        System.out.println(stringBuffer);
        String str3 =  stringBuffer.toString();
        //将字符序列可变的字符串转变为String 对象；
        System.out.println(str3);
        System.out.println(stringBuffer.delete(stringBuffer.length()-3,
        stringBuffer.length())); //删除指定位置的字符串；
        System.out.println(stringBuffer.reverse());//字符串反转；
        System.out.println(stringBuffer.capacity());//字符串的容量
        stringBuffer.setLength(20);
        System.out.println(stringBuffer);  //指定字符串长度               


    }
    
}