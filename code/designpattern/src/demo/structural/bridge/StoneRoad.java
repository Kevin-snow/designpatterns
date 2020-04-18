package demo.structural.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class StoneRoad extends Road {

    public StoneRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        vehicle.drive();
        System.out.println(" 行驶在石子路 ");
    }
}
