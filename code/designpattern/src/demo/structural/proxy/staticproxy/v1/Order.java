package demo.structural.proxy.staticproxy.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Order {

    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Order(int userId) {
        this.userId = userId;
    }
}
