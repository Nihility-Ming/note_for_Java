/**
 * 汽车
 */
public class Car extends Vehicle {
    public Car(String name, double height, double weight, String color, double length, int nuclearLoad) {
        super(name, height, weight, color, length, nuclearLoad);
    }

    public Car(String name) {
        super(name);
    }

    public Car() {
    }

    @Override
    public void run() {
        System.out.println("汽车在啪啪飞驰...");
    }

    @Override
    public void stop() {
        System.out.println("汽车在啪啪急刹...");
    }

}
