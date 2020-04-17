package demo.structural.decorator.v2;

/**
 *
 * 装饰者模式，通过使用继承，父类的实例作为装饰者构造器参数的方式，
 * 来实现装饰者模式。
 * 在装饰者模式中，重写父类的方法（给方法增加功能），调用父类的此方法来实现。
 *
 */

public abstract class AbstractDecorator extends AbstractCake {

    private AbstractCake abstractCake;

    AbstractDecorator(AbstractCake abstractCake) {
        this.abstractCake = abstractCake;
    }

    @Override
    public String makeCake() {
        return this.abstractCake.makeCake();
    }
}
