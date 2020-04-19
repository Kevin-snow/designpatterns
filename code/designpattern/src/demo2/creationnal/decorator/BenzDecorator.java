package demo2.creationnal.decorator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class BenzDecorator extends CarDecorator {

    public BenzDecorator(ICar iCar) {
        super(iCar);
    }

    @Override
    public ICar createCar() {
        ICar car = iCar.createCar();
        run();
        return car;
    }

    @Override
    public void run() {
        System.out.println("开始启动，运行");
    }
}
