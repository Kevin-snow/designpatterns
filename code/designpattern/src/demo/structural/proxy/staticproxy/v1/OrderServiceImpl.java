package demo.structural.proxy.staticproxy.v1;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        return orderDao.save(order);
    }
}
