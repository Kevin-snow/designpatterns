package demo.structural.decorator.v3;

public class LgDecorator extends AbstractDecorator {

    public LgDecorator(AbstractCar abstractCar) {
        super(abstractCar);
    }

    @Override
    public String car() {
        return super.car() + " , 换了一个轮毂";
    }
}
