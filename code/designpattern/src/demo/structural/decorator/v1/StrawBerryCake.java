package demo.structural.decorator.v1;

public class StrawBerryCake extends Cake {

    @Override
    public String makeCake() {
        return super.makeCake() + " 添加一些草莓";
    }
}
