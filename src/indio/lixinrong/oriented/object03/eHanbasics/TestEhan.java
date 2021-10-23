
package indio.lixinrong.oriented.object03.eHanbasics;

public class TestEhan {
  public static void main(String[] args) {
    EHan eHan = EHan.getInstance();
    EHan eHan2 = EHan.getInstance();
    EHan eHan3 = EHan.getInstance();
    System.out.println(eHan==eHan2);
    System.out.println(eHan2==eHan3);
    System.out.println(eHan);
  }   
}