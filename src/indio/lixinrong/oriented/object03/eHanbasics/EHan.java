package indio.lixinrong.oriented.object03.eHanbasics;

public class EHan {
  private static EHan eHan = new EHan();
  private  EHan(){

  }   
  public  static EHan getInstance(){
      return eHan;
  }
  
}
