package demo.creationnal.singleton.type3;

public class Singleton3 {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);


    }
}

// 此单例模式非线程安全
class Singleton{

    private Singleton () {}

    private static Singleton instance = null;

    // 当多线程的情况下，就会出现多个实例。
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }


}