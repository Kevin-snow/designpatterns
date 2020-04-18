package demo.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class DynamicServiceProxy implements InvocationHandler {

    private Object target;

    public DynamicServiceProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = args[0];
        beforeMethod();
        Object object = method.invoke(target,obj);
        afterMethod();
        return object;
    }

    private void beforeMethod(){
        System.out.println(" 静态代理 before code");
    }

    private void afterMethod(){
        System.out.println(" 静态代理 after code");
    }
}
