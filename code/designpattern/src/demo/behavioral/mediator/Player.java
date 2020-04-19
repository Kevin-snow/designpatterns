package demo.behavioral.mediator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public abstract class Player {

    protected QQ qq;
    public void setQQ(QQ qq){
        this.qq = qq;
    }

    // 玩家具有接收消息的功能
    protected abstract void receive();

    // 发送消息的功能
    protected abstract void send();
}
