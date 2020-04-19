package demo.behavioral.observer;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class TwoObserver implements Observer {
    @Override
    public void response() {
        System.out.println("观察者2发生了变化");
    }
}
