package demo.behavioral.command.v2;

/**
 * 服务员，属于调用者
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Waiter {

    private Command command;

    public Waiter(Command command) {
        this.command = command;
    }
    public void getBreakfast(){
        command.cooking();
    }
}
