package demo.structural.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println(" 公交车 ");
    }
}
