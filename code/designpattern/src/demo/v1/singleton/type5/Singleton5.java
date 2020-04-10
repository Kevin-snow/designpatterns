package demo.v1.singleton.type5;

public class Singleton5 {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);


    }
}

// 此单例模式双重检查，推荐使用
class Singleton{

    private Singleton () {}

    private static volatile Singleton instance = null;

    // 当多线程的情况下，就会出现多个实例。
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }


}