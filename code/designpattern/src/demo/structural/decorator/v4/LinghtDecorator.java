package demo.structural.decorator.v4;

public class LinghtDecorator extends AbstractDecorator {
    public LinghtDecorator(Benz abstractCar) {
        super(abstractCar);
    }

    @Override
    public String car() {
        return super.car() + " ， 换了一组LED大灯";
    }
}
