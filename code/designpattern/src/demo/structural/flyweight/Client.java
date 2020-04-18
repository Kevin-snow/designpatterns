package demo.structural.flyweight;

/**
 * 结构型模式有 外观模式、适配器模式、装饰者模式、享元模式、桥接模式、代理模式、组合模式
 * 创建型模式有 单例模式、工厂方法模式、抽象工厂模式、原型模式、建造者模式
 * create by kevin.
 *
 * @Date 2020/4/17
 */
public class Client {

    public static void main(String[] args) {

        for (int i = 0; i< 10; i++){
            ICar car = CarFactory.getCar("宝马");
            car.createCar();
        }





    }

}
