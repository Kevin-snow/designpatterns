package demo.behavioral.state;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class BookedState implements State {
    @Override
    public void state() {
        System.out.println("已预订状态，其他人不能预订");
    }
}
