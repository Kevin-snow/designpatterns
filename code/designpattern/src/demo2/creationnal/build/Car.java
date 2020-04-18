package demo2.creationnal;

/**
 * 建造者模式
 * create by kevin.
 *
 * @Date 2020/4/18
 */
public class Car {

    private String name;

    private String color;

    private String origin;

    private int maxSpeed;

    public Car(Builder builder){
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.name = builder.name;
        this.origin = builder.origin;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", origin='" + origin + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    static class Builder {
        private String name;

        private String color;

        private String origin;

        private int maxSpeed;


        public Builder buildName(String name){
            this.name = name;
            return this;
        }

        public Builder buildColor(String color){
            this.color = color;
            return this;
        }

        public Builder buildOrigin(String origin){
            this.origin = origin;
            return this;
        }

        public Builder buildMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car builder(){
            return new Car(this);
        }

    }
}
