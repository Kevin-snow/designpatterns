package demo.structural.decorator.v3;


public class Client {


    public static void main(String[] args) {

        AbstractCar car = new Benz();

        System.out.println(car.car());

        AbstractDecorator decorator = new LgDecorator(car);

        System.out.println(decorator.car());

        decorator = new LinghtDecorator(decorator);
        System.out.println(decorator.car());
    }
}
