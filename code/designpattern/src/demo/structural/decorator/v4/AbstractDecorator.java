package demo.structural.decorator.v4;

/**
 * 抽象装饰者
 */
public abstract class AbstractDecorator extends Benz {

    private Benz abstractCar;

    public AbstractDecorator(Benz abstractCar) {
        this.abstractCar = abstractCar;
    }

    @Override
    public String car() {
        return abstractCar.car();
    }
}
