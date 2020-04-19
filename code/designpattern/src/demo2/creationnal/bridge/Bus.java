package demo2.creationnal.bridge;


/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Bus implements Vehice {

    private String name;

    public Bus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Vehice getVehicle() {
        return new Bus(name);
    }
}
