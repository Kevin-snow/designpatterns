package demo.behavioral.state;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class RoomContext {

    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.state();
    }
}
