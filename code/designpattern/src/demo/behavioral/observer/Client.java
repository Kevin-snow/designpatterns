package demo.behavioral.observer;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Client {

    public static void main(String[] args) {

        Observer observer = new OneObserver();
        Observer observer2 = new TwoObserver();

        Subject subject = new ConcreteSuject();
        subject.add(observer);
        subject.add(observer2);
        subject.modifyObserver();
    }




}
