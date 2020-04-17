package demo.creationnal.builder.v2;

/**
 * 建造者模式传统写法.
 *
 */
public class Client {


    public static void main(String[] args) {

        Director director = new Director(new ConcreteBuilder());
        Car car = director.build("红色", "奔驰", 230,"德国");
        System.out.println(car);
    }
}
