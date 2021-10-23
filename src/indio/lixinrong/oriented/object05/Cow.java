package indio.lixinrong.oriented.object05;

// import javafx.scene.paint.Color;

public class Cow {
    private double weight;
    public Cow(){

    } 
    public Cow(double weight){
        this.weight = weight;
    }
    private class CowLeg{
        private double length;
        private String color;
        public CowLeg(){

        }
        public CowLeg(double length, String color){
        this.color = color;
        this.length = length;

        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void getInfo(){
            System.out.println("当前牛腿颜色："+color+"  高："+length);
            System.out.println("牛腿重："+weight);//非静态内部类可以直接访问外部内的成员；
            //非静态内部类可以直接访问外部类的private 成员；


        }
        

}
       public void test(){
           CowLeg c1 = new CowLeg(1.12,"黑白相间");
           c1.getInfo();
           System.out.println(new CowLeg().color);

       }
       public static void main(String[] args){
           
        
           Cow cow = new Cow(379.9);
           CowLeg cowLeg = cow.new CowLeg();
           System.out.println(cow.new CowLeg().color); 
          //  System.out.println(new CowLeg().color);
          // CowLeg cowLeg = new CowLeg();静态方法在类加载时执行，
          //而非静态内部类只能通过外部内的实例对象才能创建。
           cow.test();
       }

}