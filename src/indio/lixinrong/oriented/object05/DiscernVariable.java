package indio.lixinrong.oriented.object05;

public class DiscernVariable {
    private String prop ="外部类属性";
    String prop1="100";
          // prop1 = prop1+"a";
    private class Inclass{
          private String prop ="内部类属性";
          public void info(){
              String prop = "局部变量";
              System.out.println("外部类属性值"+DiscernVariable.this.prop);
              System.out.println("内部类属性值"+this.prop);
              System.out.println("局部变量属性值"+prop);
          }
    }
    
    public void test(){
        Inclass in = new Inclass();
        in.info();
    }
    String a="ew";
    String b ="ew";
    public static void main(String[] args) {
        new DiscernVariable().test();
        
        System.out.println(new DiscernVariable().a==new DiscernVariable().b);
    }
    
}