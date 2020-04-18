package demo.structural.flyweight;

/**
 * create by kevin.
 *
 * @Date 2020/4/17
 */
public class Car implements ICar {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void createCar() {
        System.out.println( " 得到一辆" + this.name + " 车");
    }
}
