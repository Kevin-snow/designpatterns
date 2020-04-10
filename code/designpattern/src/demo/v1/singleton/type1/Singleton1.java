package demo.v1.singleton.type1;

/**
 * 单例模式写法1
 * 饿汉式1
 * @author kevin
 */
public class Singleton1 {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton{
    private Singleton(){}

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}