package demo.behavioral.command.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker(new ConcreteCommand());
        invoker.execute();
    }
}
