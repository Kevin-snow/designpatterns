package demo.creationnal.builder.v1;


/**
 * 建造者模式的链式写法。
 * create by kevin.
 */
public class Car {

    private String color;

    private String name;

    private int maxSpeed;

    private String origin;

    public Car(Builder builder){
        this.color = builder.color;
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.origin = builder.origin;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", origin='" + origin + '\'' +
                '}';
    }

    public static class Builder{
        private String color;

        private String name;

        private int maxSpeed;

        private String origin;

        public Builder(){}

        public Builder builderColor(String color){
            this.color = color;
            return this;
        }

        public Builder builderName(String name){
            this.name = name;
            return this;
        }

        public Builder builderMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder builderOrigin(String origin){
            this.origin = origin;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }




}
