package demo.behavioral.mediator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class ConcretePlayer3 extends Player {
    @Override
    protected void receive() {
        System.out.println("玩家3接收消息 ");
    }

    @Override
    protected void send() {
        System.out.println("玩家3发送消息");
        qq.relay(this);
    }
}
