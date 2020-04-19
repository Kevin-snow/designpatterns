package demo.behavioral.mediator;

/**
 *
 * 中介者模式
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {
        Player player1 = new ConcretePlayer1();
        Player player2 = new ConcretePlayer2();
        Player player3 = new ConcretePlayer3();
        QQ qq = new ConcreteQQ();
        qq.register(player1);
        qq.register(player2);
        qq.register(player3);
        player1.send();

        System.out.println("---------");

        player2.send();
    }
}
