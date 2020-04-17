package demo.creationnal.singleton.type6;

/**
 * 静态内部类的写法
 */
public class Singleton6 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singleton{

    private Singleton(){}


    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

    public static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}
