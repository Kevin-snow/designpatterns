package demo.behavioral.strategy;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Direcor {

    private Drive drive;

    public Direcor(Drive drive) {
        this.drive = drive;
    }

    public void runVehicle(){
        drive.drive();
    }
}
