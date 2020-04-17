package demo.structural.face;

/**
 * 门户的对外接口
 */
public class ParentService {

    private LogisticsService logisticsService = new LogisticsService();

    private OrderService orderService = new OrderService();

    private StoreService storeService = new StoreService();

//    public void setLogisticsService(LogisticsService logisticsService) {
//        this.logisticsService = logisticsService;
//    }
//
//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    public void setStoreService(StoreService storeService) {
//        this.storeService = storeService;
//    }

    public void goodsInfo(Goods goods){
        orderService.createOrder(goods);
        storeService.minus(goods);
        logisticsService.send(goods);
    }

}
