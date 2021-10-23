public abstract class Device {
    private String name;
    public abstract double getPrice();
    
    public Device(){

    }
    public Device(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

}
class TestAnonymous{
   public void test(Device d){
       System.out.println("购买"+d.getName()+"花掉"+d.getPrice());
    }
    public static void main(String[] args) {
        TestAnonymous testAnonymous = new TestAnonymous();
        //调用有参数的构造器创建Device匿名实现类的对象
        testAnonymous.test(new Device("电子示波器"){
            @Override
            public double getPrice(){
                return 12.3;

            }
        });
        testAnonymous.test(new Device(){
            
            {
                System.out.println("匿名内部类的初始化代码块");
            }
            public double getPrice(){
                return 22.3;
            }
            /*public String getName(){
                return "键盘";
            }*/
        });
    }




}