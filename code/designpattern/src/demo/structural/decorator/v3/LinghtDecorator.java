package demo.structural.decorator.v3;

public class LinghtDecorator extends AbstractDecorator {
    public LinghtDecorator(AbstractCar abstractCar) {
        super(abstractCar);
    }

    @Override
    public String car() {
        return super.car() + " ， 换了一组LED大灯";
    }
}
