package demo.structural.proxy.dynamicproxy;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int save(Order order) {
        System.out.println("保存订单成功");
        return 1;
    }
}
