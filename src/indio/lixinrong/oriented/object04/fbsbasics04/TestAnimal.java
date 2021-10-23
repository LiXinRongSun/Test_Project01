package indio.lixinrong.oriented.object04.fbsbasics04;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Frog("大兵","绿色","呱呱叫");
        Swimming swimming = new Frog();
        Context context = new Context(swimming);
        context.doSwimming();
    }
    
}