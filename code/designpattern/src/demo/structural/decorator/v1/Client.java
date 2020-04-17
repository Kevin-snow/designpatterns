package demo.structural.decorator.v1;

/**
 * 使用继承的方式实现对类的功能扩展
 */
public class Client {

    public static void main(String[] args) {
        Cake cake = new Cake();

        System.out.println(cake.makeCake());

        StrawBerryCake strawBerryCake = new StrawBerryCake();
        System.out.println(strawBerryCake.makeCake());
        ChocolateStrawBerryCake chocolateStrawBerryCake = new ChocolateStrawBerryCake();
        System.out.println(chocolateStrawBerryCake.makeCake());




    }
}
