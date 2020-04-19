package demo.behavioral.command.v2;

/**
 *
 * 混沌的命令
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class HunTunCommand implements Command {

    // 具体命令的接收者
    private HunTunChef hunTunChef;

    public HunTunCommand() {
        this.hunTunChef = new HunTunChef();
    }

    @Override
    public void cooking() {
        hunTunChef.cooking();
    }
}
