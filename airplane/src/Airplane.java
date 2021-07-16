public class Airplane {
    // fields (state)

    int id;

    boolean hasLanded;

    // Methods (behaviour)

    void land() {
        System.out.println("Plane " + id + " is landing.");
        hasLanded = true;
    }
    void takeOff() {
        System.out.println("Plane " + id + " is taking off.");
        hasLanded = false;
    }
}
