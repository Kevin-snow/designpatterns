package demo2.creationnal;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Client {

    public static void main(String[] args) {

        Car car = new Car.Builder().buildColor("蓝色").buildName("科鲁兹").buildMaxSpeed(250)
                .buildOrigin("美国").builder();

        System.out.println(car.toString());

    }

}
