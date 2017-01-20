/**
 * 飞机
 */
public class Plane extends Vehicle {
    public Plane(String name, double height, double weight, String color, double length, int nuclearLoad) {
        super(name, height, weight, color, length, nuclearLoad);
    }

    public Plane(String name) {
        super(name);
    }

    public Plane() {
    }

    @Override
    public void run() {
        System.out.println("飞机在呜呜地飞翔着...");
    }

    @Override
    public void stop() {
        System.out.println("飞机呜呜地降落停止飞翔...");
    }
}
