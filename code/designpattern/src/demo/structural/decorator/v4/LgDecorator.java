package demo.structural.decorator.v4;

public class LgDecorator extends AbstractDecorator {

    public LgDecorator(Benz abstractCar) {
        super(abstractCar);
    }

    @Override
    public String car() {
        return super.car() + " , 换了一个轮毂";
    }
}
