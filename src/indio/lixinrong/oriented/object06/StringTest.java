package indio.lixinrong.oriented.object06;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        Scanner scanner  =  new Scanner(System.in);
        int a=scanner.nextInt();
        //保证在被除数为0的时候退出循环；
        while(a/2!=0||a%2==1){
            stringBuilder.append(a%2);
                  a /=2;
        }
        //当前字符串长度除以8加1 得到应该有的字符串长度
        int sum = ((stringBuilder.length()/8)+1)*8;
        
        for(int i=stringBuilder.length();i<sum;i++ ){
            stringBuilder.append(0);
        }
        //字符串反转
        stringBuilder.reverse();
        
        for(int i=stringBuilder.length()-4;i>=4;i=i-4){
            //从后向前加加入空格 字符串前面下标不会发生改变；
            stringBuilder.insert(i," ");
            
        }
        
        System.out.println(stringBuilder);
    }
    
}