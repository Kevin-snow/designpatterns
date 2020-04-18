package demo.structural.proxy.staticproxy.v2;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Client {

    public static void main(String[] args) {

        IUserService proxy = new UserServiceProxy(new UserServiceImpl());
        proxy.saveUser(new User("李四"));
    }

}
