package demo.creationnal.factory.methodfactory;

/**
 * 工厂方法模式
 */
public abstract class VideoFactory {

    //工厂方法模式，抽象工厂类，工厂具体的生产哪个产品由其子类来决定。

    // 可使用抽象类 和 接口， 进行规范和约束。如果有明确的属性，则使用抽象类。

    // 这里我使用抽象类来定义, 此时就不在需要参数了。
    public abstract Video getVideo();

}
