package demo2.creationnal.decorator;

/**
 * create by kevin.
 *
 * @Date 2020/4/19
 */
public class Benz implements ICar{

    private String linght;

    private String chelun;

    private String name;

    public Benz() {
    }

    public Benz(Builder builder){
        this.linght = builder.linght;
        this.chelun = builder.chelun;
        this.name = builder.name;
    }

    static class Builder{
        private String linght;

        private String chelun;

        private String name;

        public Builder buildLinght(String linght){
            this.linght = linght;
            return this;
        }

        public Builder buildChelun(String chelun){
            this.chelun = chelun;
            return this;
        }

        public Builder buildName(String name){
            this.name = name;
            return this;
        }

        public Benz build(){
            return new Benz(this);
        }
    }

    @Override
    public String toString() {
        return "Benz{" +
                "linght='" + linght + '\'' +
                ", chelun='" + chelun + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public ICar createCar() {
        return new Benz.Builder().buildChelun("四轮").buildName("奔驰").buildLinght("LED大灯").build();
    }
}
