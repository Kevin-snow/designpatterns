package demo.behavioral.command.v2;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter(new HunTunCommand());
        waiter.getBreakfast();

    }
}
