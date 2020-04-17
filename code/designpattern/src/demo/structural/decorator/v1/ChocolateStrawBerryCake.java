package demo.structural.decorator.v1;

public class ChocolateStrawBerryCake extends StrawBerryCake {

    @Override
    public String makeCake() {
        return super.makeCake() + " 添加一些巧克力";
    }
}
