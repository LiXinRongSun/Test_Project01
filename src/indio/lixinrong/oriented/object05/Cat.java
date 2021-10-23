package indio.lixinrong.oriented.object05;
/**
 * 重写equals方法；
 * instanceof 关键字
 */
public class Cat {
    private String color;
    private  int  height;
    private int weight;
    public Cat(){

    }
    public Cat(String color,int height,int weight){
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //重写equals方法
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(this == object){
            return true;

        }
        if(object instanceof Cat){
            Cat cat =(Cat) object;//向下转型
            //if object是一个向上转型过的父类引用也能编译通过 
            //但是这样的父类引用不能使用子类的独有的成员变量和方法所以需要向下转型；
            // Object 是 Cat 的引用时编译也能通过；
             
            if(this.color.equals(cat.color) && this.height == cat.height && 
            this.weight== cat.weight)
            return true;
    

        }
        
        return false;
    }
    public static void main(String[] args) {
        Cat cat =new Cat("白色",30,10);
        Cat cat2 = new Cat("白色",30,10);
        System.out.println(cat.equals(cat2));
        
    }
    
}