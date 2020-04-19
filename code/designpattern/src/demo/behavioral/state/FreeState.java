package demo.behavioral.state;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class FreeState implements State {
    @Override
    public void state() {
        System.out.println(" 空闲状态，没人入住 ");
    }
}
