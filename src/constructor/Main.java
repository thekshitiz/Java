package constructor;

// Create a Main class
public class Main {
    int x;
    String name = "dog";

    // Create a class constructor for the Main class
    protected Main() {
        x = 5;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.name);
    }
}
