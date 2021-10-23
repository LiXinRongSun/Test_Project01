package indio.lixinrong.oriented.object04.facbasics;

public class TestFactory {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("");
        fruit.grow();
        Fruit fruit2 = FruitFactory.getFruit("1");
        System.out.println(fruit2);
    }
    
}