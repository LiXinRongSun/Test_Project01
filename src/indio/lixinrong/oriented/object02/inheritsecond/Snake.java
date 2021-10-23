package indio.lixinrong.oriented.object02.inheritsecond;
/**
 * 这是一个子类
 */
public class Snake extends Game {
        
    public int blood(){
        if(value<10){
            return  value+=20;

           }else{
            return value;

        }


        }
    public void move(){
        System.out.println("我是蛇怪，我走S型路线");

    }
    
}
