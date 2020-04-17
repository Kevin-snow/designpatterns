package demo.structural.decorator.v2;

/**
 * 装饰者模式，实现类的功能扩展。
 */
public class Client {


    public static void main(String[] args) {
        AbstractCake abstractCake = new ConcreteCake();
        AbstractDecorator decorator = new StrawBerryDecorator(abstractCake);
        decorator = new ChocolateStrawBerryDecorator(decorator);
        System.out.println(decorator.makeCake());

    }
}
