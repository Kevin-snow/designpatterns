package demo.structural.proxy.dynamicproxy;

import demo.structural.proxy.staticproxy.v1.OrderServiceProxy;

import java.lang.reflect.Proxy;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Client {


    public static void main(String[] args) {

//        DynamicServiceProxy dynamicServiceProxy = new DynamicServiceProxy(new OrderServiceImpl());

//        IOrderService orderService = (IOrderService) Proxy.newProxyInstance(OrderServiceImpl.class.getClassLoader(),
//                OrderServiceImpl.class.getInterfaces(), dynamicServiceProxy);

        IOrderService orderService = (IOrderService) new DynamicServiceProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(new Order(1));

    }
}
