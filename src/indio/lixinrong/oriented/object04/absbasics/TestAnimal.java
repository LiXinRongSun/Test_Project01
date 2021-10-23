

package indio.lixinrong.oriented.object04.absbasics;

import indio.lixinrong.oriented.object04.absbasics.Animal;

public class TestAnimal {
 public static void main(String[] args) {
     Animal animal = new Cat();//抽象类不能直接创建对象
     animal.shout();

     
 }   
}
