package demo.creationnal.builder.v1;

/**
 * 链式建造者模式的写法。
 */
public class Client {

    public static void main(String[] args) {

        Car car = new Car.Builder().builderColor("红色").builderName("宝马").builderMaxSpeed(250).builderOrigin("德国").build();
        System.out.println(car.toString());
    }

}
