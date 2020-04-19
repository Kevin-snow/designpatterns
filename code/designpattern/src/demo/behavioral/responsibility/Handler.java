package demo.behavioral.responsibility;

/**
 * create by kevin.
 *  抽象处理类
 * @Date 2020/4/19
 */
public abstract class Handler {
    // 定义下一个处理者
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    // 抽象处理请求的方法
    public abstract void handlerRequest(int num);

}
