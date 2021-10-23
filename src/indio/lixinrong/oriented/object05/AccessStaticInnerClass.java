package indio.lixinrong.oriented.object05;

public class AccessStaticInnerClass {
    public static class StaticInnerClass{
        private static int prop1 = 5;
        private int prop2 = 9;
    }
    public void accessInnerProp(){
        System.out.println(StaticInnerClass.prop1);
        System.out.println(new StaticInnerClass().prop2);
    }
    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println(staticInnerClass.prop2);
        AccessStaticInnerClass accessStaticInnerClass = new AccessStaticInnerClass();
        accessStaticInnerClass.accessInnerProp();
    }
}