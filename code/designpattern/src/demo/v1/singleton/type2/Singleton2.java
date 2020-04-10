package demo.v1.singleton.type2;

/**
 * 单例模式写法2
 * 饿汉式，静态代码块的写法
 * @author kevin
 */
public class Singleton2 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }


}


class Singleton{

    private Singleton(){

    }

    private final static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}