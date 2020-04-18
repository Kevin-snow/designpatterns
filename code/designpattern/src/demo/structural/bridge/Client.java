package demo.structural.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Client {

    public static void main(String[] args) {

        // 抽象部分与实现部分分离。使他们能够独立发展。
        // 此例子中，交通工具和路分别进行抽象，各自实现各自的抽象。在高层进行组合。
        Vehicle vehicle = new Bus();
        Road road = new AsphaltRoad(vehicle);

        road.driveOnRoad();

    }

}
