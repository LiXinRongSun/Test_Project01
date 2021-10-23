public interface Product {
    int i =100;

    public double getPrice();
    public String getName();
}
class A implements Product{
  public double getPrice(){
      return 1;
  }
  public String  getName(){
      return "2";
  }


}
class TestAnonymous1{
    public void test(Product p){
        System.out.println(Product.i+""+p.getName()+" "+ p.getPrice());
    }
    public static void main(String[] args) {
        TestAnonymous1 ta =new TestAnonymous1();
        Product p =new A();
        ta.test(p);
        /**
         * 匿名内部类 不需要修饰符
         */
       
        ta.test(new Product(){
            @Override
            public double getPrice(){
                return 2.0;
            }
            @Override
            public String getName(){
                return "3000";
            }
        });
    }
}