package demo2.creationnal.bridge;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public abstract class ARoad {
    protected Vehice vehice;

    public ARoad(Vehice vehice) {
        this.vehice = vehice;
    }

    public abstract void run();
}
