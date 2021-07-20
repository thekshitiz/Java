public class Airplane {
    // fields (state)

    private int id;
    private boolean hasLanded;

    // constructor
    public Airplane(int planeId){
        id = planeId;
    }

    // Methods (behaviour)

    void land() {
        System.out.println("Plane " + id + " is landing.");
        hasLanded = true;
    }
    void takeOff() {
        System.out.println("Plane " + id + " is taking off.");
        hasLanded = false;
    }

    void printDetails(){
        System.out.println("The plane " + id + " has landed: " + hasLanded);
    }
}
