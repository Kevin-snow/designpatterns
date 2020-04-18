package demo.structural.proxy.staticproxy.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Client {


    public static void main(String[] args) {
        OrderServiceProxy proxy = new OrderServiceProxy();
        proxy.saveOrder(new Order(1));
    }
}
