package demo.creationnal.builder.v2;

public abstract class Builder {

    public abstract void buildColor(String color);

    public abstract void buildName(String name);

    public abstract void buildMaxSpeed(int maxSpeed);

    public abstract void buildOrigin(String origin);

    public abstract Car build();
}
