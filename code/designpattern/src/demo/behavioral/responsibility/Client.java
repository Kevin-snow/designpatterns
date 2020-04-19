package demo.behavioral.responsibility;

/**
 * 责任链模式
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Handler handler = director.handler();
        handler.handlerRequest(2);
    }

}
