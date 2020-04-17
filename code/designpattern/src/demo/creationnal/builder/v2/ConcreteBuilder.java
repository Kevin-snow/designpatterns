package demo.creationnal.builder.v2;

public class ConcreteBuilder extends Builder {
    private Car car = new Car();

    @Override
    public void buildColor(String color){
        car.setColor(color);
    }
    @Override
    public void buildName(String name){
        car.setName(name);
    }
    @Override
    public void buildMaxSpeed(int maxSpeed){
        car.setMaxSpeed(maxSpeed);
    }
    @Override
    public void buildOrigin(String origin){
        car.setOrigin(origin);
    }
    @Override
    public Car build(){
        return car;
    }


}
