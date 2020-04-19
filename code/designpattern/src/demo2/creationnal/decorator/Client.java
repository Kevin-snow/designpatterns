package demo2.creationnal.decorator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {
        ICar car = new Benz().createCar();
        CarDecorator decorator = new BenzDecorator(car);
        decorator.createCar();
    }

}
