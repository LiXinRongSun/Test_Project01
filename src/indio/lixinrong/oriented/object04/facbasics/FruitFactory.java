package indio.lixinrong.oriented.object04.facbasics;

public class FruitFactory {
 public static Fruit getFruit(String fruit){
    if("apple".equals(fruit))
    {
        return  new Apple();
    }
    else{
    return null;
    }
 }
}