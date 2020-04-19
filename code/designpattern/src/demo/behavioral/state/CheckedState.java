package demo.behavioral.state;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class CheckedState implements State {
    @Override
    public void state() {
        System.out.println("已入住，别人不能入住");
    }
}
