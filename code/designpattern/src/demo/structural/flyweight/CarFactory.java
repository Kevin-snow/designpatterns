package demo.structural.flyweight;

import java.util.HashMap;

/**
 * create by kevin.
 *
 * @Date 2020/4/17
 */
public class CarFactory {

    private static HashMap<String, ICar> carHashMap = new HashMap<>();

    public static ICar getCar(String name){
        ICar car = carHashMap.get(name);

        if (car == null){
            System.out.println(" 新生产一辆"+name+"汽车");
            car = new Car(name);
            carHashMap.put(name,car);
        }

        return car;
    }

}
