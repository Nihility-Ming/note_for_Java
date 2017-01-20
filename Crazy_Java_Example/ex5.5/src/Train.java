/**
 * 火车
 */
public class Train extends Vehicle {
    public Train(String name, double height, double weight, String color, double length, int nuclearLoad) {
        super(name, height, weight, color, length, nuclearLoad);
    }

    public Train(String name) {
        super(name);
    }

    public Train() {
    }

    @Override
    public void run() {
        System.out.println("火车在唧唧地行驶着...");
    }

    @Override
    public void stop() {
        System.out.println("火车在唧唧地刹车中...");
    }


}
