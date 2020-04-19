package demo.behavioral.command.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void execute(){
        System.out.println(" 调用者执行 Command 命令");
        command.execute();
    }
}
