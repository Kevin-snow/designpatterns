package demo.behavioral.observer;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class ConcreteSuject extends Subject {

    @Override
    public void modifyObserver() {
        for (Observer observer : lists){
            observer.response();
        }
    }
}
