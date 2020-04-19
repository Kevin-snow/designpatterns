package demo.behavioral.command.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
