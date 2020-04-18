package demo.structural.proxy.staticproxy.v2;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println(user.getName() + " 添加用户 ");
    }
}
