package demo.behavioral.responsibility;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Director {

    public Handler handler(){
        Handler handler = new OneHandler();
        handler.setNext(new TwoHandler());
        return handler;
    }
}
