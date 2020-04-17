package demo.structural.decorator.v3;

/**
 * 抽象装饰者
 */
public abstract class AbstractDecorator extends AbstractCar {

    private AbstractCar abstractCar;

    public AbstractDecorator(AbstractCar abstractCar) {
        this.abstractCar = abstractCar;
    }

    @Override
    public String car() {
        return abstractCar.car();
    }
}
