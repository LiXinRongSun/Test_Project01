package indio.lixinrong.oriented.object03.lhanbasics;

public class LHan {
 private static LHan lHan;
 private  LHan(){

 }
 public static LHan getInstance(){
     if(lHan==null){
         lHan =new LHan();

     }
     return lHan;
 }
}
