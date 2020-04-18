package demo.structural.composite;

/**
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Course extends MenuComponent {

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(" 课程名称：" + this.name + " 价格：" + this.price);
    }
}
