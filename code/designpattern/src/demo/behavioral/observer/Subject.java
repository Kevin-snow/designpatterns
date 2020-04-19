package demo.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public abstract class Subject {

    protected List<Observer> lists = new LinkedList<Observer>();

    public void add(Observer observer){
        lists.add(observer);
    }

    public void remove(Observer observer){
        lists.remove(observer);
    }

    public abstract void modifyObserver();
}
