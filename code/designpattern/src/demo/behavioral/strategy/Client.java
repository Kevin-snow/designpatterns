package demo.behavioral.strategy;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {

        Direcor drive = new Direcor(new BusDriver());
        drive.runVehicle();
    }

}
