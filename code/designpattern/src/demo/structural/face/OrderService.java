package demo.structural.face;

/**
 * 订单子系统
 */
public class OrderService {


    public void createOrder(Goods goods){
        System.out.println(goods.getName() + " 下单成功");
    }



}
