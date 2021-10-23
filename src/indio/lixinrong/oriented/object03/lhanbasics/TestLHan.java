package indio.lixinrong.oriented.object03.lhanbasics;

public class TestLHan {
    public static void main(String[] args) {
        LHan lHan = LHan.getInstance();
        LHan lHan2 = LHan.getInstance();
        LHan lHan3 = LHan.getInstance();
        
        System.out.println(lHan==lHan2);
        System.out.println(lHan2==lHan3);
    }
    
}