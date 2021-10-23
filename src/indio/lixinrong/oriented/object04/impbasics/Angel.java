package indio.lixinrong.oriented.object04.impbasics;
/**
 * 这是一个实现接口类
 * 一个类要实现接口必须实现接口所有的方法 “public”
 */
public class Angel implements Honest, Volant {
    public void fly(){
        System.out.println("我是天使，飞起来了");
    }//实现 Volant 接口的方法；
    public void helpOther(){
        System.out.println("扶老奶奶过马路");
    }//实现 Honest 的方法；
}
