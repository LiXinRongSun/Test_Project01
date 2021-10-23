package indio.lixinrong.oriented.object04.fbsbasics04;

public class Frog extends Animal implements Swimming{
    public Frog(){
        
    }
    public Frog(String name ,String color,String attribute ){
        super();
    }
    public void eat(){
        System.out.println("爱吃昆虫");

    }
    public void call(){
        System.out.println("呱呱叫");

    }
    @Override
    public void swimm(){
        System.out.println("虽然不是鱼也是游泳高手");

    }
}