package demo.structural.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class AsphaltRoad extends Road {

    public AsphaltRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        vehicle.drive();
        System.out.println(" 行驶在柏油路 ");
    }
}
