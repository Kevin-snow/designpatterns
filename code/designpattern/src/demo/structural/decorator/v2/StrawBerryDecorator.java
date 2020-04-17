package demo.structural.decorator.v2;

public class StrawBerryDecorator extends AbstractDecorator {


    public StrawBerryDecorator(AbstractCake abstractCake) {
        super(abstractCake);
    }

    @Override
    public String makeCake() {
       return super.makeCake() + " 添加一些草莓";
    }
}
