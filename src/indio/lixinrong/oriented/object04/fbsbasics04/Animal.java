package indio.lixinrong.oriented.object04.fbsbasics04;

public abstract class Animal {
    String name;
    String color;
    String attribute;
    public Animal(){

    }
    public  Animal(String name, String color,String attribute) {
        this.name = name;
        this.color = color;
        this.attribute =attribute;
        
    }
    public abstract void eat();
    public abstract void call();
    
    
}