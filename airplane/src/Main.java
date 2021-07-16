public class Main {
public static void main(String[] a) {
    Airplane plane1 = new Airplane();
    plane1.id = 1;
    plane1.hasLanded = false;
    plane1.land();

    System.out.println("Plane 1 has landed: " + plane1.hasLanded);

    Airplane plane2 = new Airplane();
    plane2.id = 69;
    plane2.takeOff();
}
}
