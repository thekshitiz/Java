public class CarTest {
    public static void main(String[] args) {

        Car myCar = new Car ("BMW");
        myCar.start();
        myCar.accelerate();
        myCar.showSpeed();
        myCar.stop();
        myCar.showSpeed();

        Car myCar1 = new Car("Ferrari", "pink", 2020); // calls toString() method in car.
        System.out.println(myCar1);
    }
}
