package demo.v1.singleton.type7;

/**
 * 枚举类的写法
 */
public class Singleton7 {

    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton == singleton2);

        Runtime
    }
}

enum Singleton {

    INSTANCE;


}