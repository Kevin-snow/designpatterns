package demo.behavioral.mediator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class ConcretePlayer1 extends Player {
    @Override
    protected void receive() {
        System.out.println("玩家1接收消息");
    }

    @Override
    protected void send() {
        System.out.println("玩家1发送消息");
        qq.relay(this);
    }
}
