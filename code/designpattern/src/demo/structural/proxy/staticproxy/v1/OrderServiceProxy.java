package demo.structural.proxy.staticproxy.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class OrderServiceProxy {

    private IOrderService orderService;

    public void saveOrder(Order order){
        orderService = new OrderServiceImpl();
        beforeMethod();
        afterMethod();

        orderService.saveOrder(order);
    }

    private void beforeMethod(){
        System.out.println(" 静态代理 before code");
    }

    private void afterMethod(){
        System.out.println(" 静态代理 after code");
    }

}
