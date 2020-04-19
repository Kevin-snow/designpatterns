package demo.behavioral.observer;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class OneObserver implements Observer {
    @Override
    public void response() {
        System.out.println(" 观察者1 发生了变化 ");
    }
}
