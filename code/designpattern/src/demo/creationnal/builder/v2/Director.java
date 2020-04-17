package demo.creationnal.builder.v2;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Car build(String color, String name, int maxSpeed, String origin){
        builder.buildColor(color);
        builder.buildName(name);
        builder.buildMaxSpeed(maxSpeed);
        builder.buildOrigin(origin);
        return builder.build();
    }

}
