package demo.behavioral.state;

/**
 * 状态模式，将状态抽象成接口。由其子类去实现具体的状态。
 * 在其他的容器中依赖该状态。
 *
 * 比如本例子。将房间状态进行抽象。分为1.可预订，无人入住。2.已预订，不可预订 3.已入住，其他人不能入住。
 * 在房间类中聚合该接口类。进行状态的修改。
 *
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {

        RoomContext roomContext = new RoomContext();
        roomContext.setState(new BookedState());
        roomContext.setState(new CheckedState());

    }
}
