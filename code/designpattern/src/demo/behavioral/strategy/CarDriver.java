package demo.behavioral.strategy;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class CarDriver implements Drive {
    @Override
    public void drive() {
        System.out.println(" 小车司机驾驶 ");
    }
}
