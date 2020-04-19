package demo2.creationnal.decorator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public abstract class CarDecorator implements ICar{

    protected ICar iCar;

    public CarDecorator(ICar iCar) {
        this.iCar = iCar;
    }

    public abstract void run();

}
