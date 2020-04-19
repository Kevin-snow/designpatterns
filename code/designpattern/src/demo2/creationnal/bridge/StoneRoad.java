package demo2.creationnal.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class StoneRoad extends ARoad {


    public StoneRoad(Vehice vehice) {
        super(vehice);
    }

    @Override
    public void run() {
        System.out.println(((Bus)vehice.getVehicle()).getName() + " 行驶在 石子路上");
    }
}
