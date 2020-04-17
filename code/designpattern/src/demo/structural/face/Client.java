package demo.structural.face;

/**
 * 外观模式，又叫门面模式。
 * 符合迪米特法则。
 * 但是不符合ocp原则。
 */
public class Client {

    public static void main(String[] args) {

        Goods goods = new Goods("钢笔");

        ParentService parentService = new ParentService();
//        parentService.setLogisticsService(new LogisticsService());
//        parentService.setOrderService(new OrderService());
//        parentService.setStoreService(new StoreService());

        parentService.goodsInfo(goods);

    }
}
