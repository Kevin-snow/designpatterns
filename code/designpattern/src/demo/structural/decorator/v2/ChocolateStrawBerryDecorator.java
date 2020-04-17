package demo.structural.decorator.v2;

public class ChocolateStrawBerryDecorator extends AbstractDecorator {


    public ChocolateStrawBerryDecorator(AbstractCake abstractCake) {
        super(abstractCake);
    }

    @Override
    public String makeCake() {
        return super.makeCake() + " 添加一些巧克力";
    }
}
