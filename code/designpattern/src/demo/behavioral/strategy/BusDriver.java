package demo.behavioral.strategy;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class BusDriver implements Drive {
    @Override
    public void drive() {
        System.out.println(" 公交司机驾驶 ");
    }
}
