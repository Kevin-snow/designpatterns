package demo2.creationnal.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {

        Vehice vehice = new Bus("公交车");

        ARoad road = new StoneRoad(vehice);

        road.run();

    }

}
