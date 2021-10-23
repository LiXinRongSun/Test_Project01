/**
 * 这是一个测试类
 */
package indio.lixinrong.oriented.object02.inheritsecond;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snake snake =new Snake();
        Centipede centipede = new Centipede();
        snake.name = sc.next();
        snake.value = sc.nextInt();
        snake.aggressivity = sc.nextInt();
        centipede.name = sc.next();
        centipede.value = sc.nextInt();
        centipede.aggressivity =sc.nextInt();
        System.out.println(snake.name+"展开攻击");
        System.out.println("当前生命值"+snake.value);
        System.out.println("攻击力是"+snake.aggressivity);
        System.out.println("实施大蛇补血术"+"当前生命值是"+snake.blood());
        System.out.print("我是蛇怪，我走");
        snake.move();
        

        }
    
}