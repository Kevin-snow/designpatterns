package demo.structural.proxy.staticproxy.v2;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class UserServiceProxy implements IUserService {

    private IUserService userService;

    public UserServiceProxy(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void saveUser(User user) {
        beforeMethod();
        userService.saveUser(user);
        afterMethod();
    }

    private void beforeMethod(){
        System.out.println(" 静态代理 before method");
    }

    private void afterMethod(){
        System.out.println(" 静态代理 after method");
    }
}
