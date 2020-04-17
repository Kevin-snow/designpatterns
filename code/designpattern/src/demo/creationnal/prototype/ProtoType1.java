package demo.creationnal.prototype;


/**
 * 原型模式
 */
public class ProtoType1 implements Cloneable {

    private String beanName;

    private int beanType;

    public ProtoType1(String beanName, int beanType) {
        this.beanName = beanName;
        this.beanType = beanType;
    }

    @Override
    protected ProtoType1 clone() throws CloneNotSupportedException {
        return (ProtoType1)super.clone();
    }

    @Override
    public String toString() {
        return "ProtoType1{" +
                "beanName='" + beanName + '\'' +
                ", beanType=" + beanType +
                '}';
    }
}
