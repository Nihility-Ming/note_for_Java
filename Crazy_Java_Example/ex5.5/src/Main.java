public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("越野车", 180, 2000, "Yellow", 350, 5);
        car.run();
        car.stop();

        Vehicle plane = new Plane("MH420", 2555, 33333, "White", 3500, 200);
        plane.run();
        plane.stop();

        Vehicle train = new Train("悬浮大火车", 2333, 422122, "Red", 2234, 223333);
        train.run();
        train.stop();

        System.out.println(car);
        System.out.println(plane);
        System.out.println(train);
    }
}
