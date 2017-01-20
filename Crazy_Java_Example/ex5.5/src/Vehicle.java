/**
 * 交通工具
 */
public abstract class Vehicle {
    private String name;
    private double height;
    private double weight;
    private String color;
    private double length;
    private int nuclearLoad;

    public Vehicle(String name, double height, double weight, String color, double length, int nuclearLoad) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.length = length;
        this.nuclearLoad = nuclearLoad;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
    }

    public abstract void run();
    public abstract void stop();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNuclearLoad() {
        return nuclearLoad;
    }

    public void setNuclearLoad(int nuclearLoad) {
        this.nuclearLoad = nuclearLoad;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", length=" + length +
                ", nuclearLoad=" + nuclearLoad +
                '}';
    }
}
