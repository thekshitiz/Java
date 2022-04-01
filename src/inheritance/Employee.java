package inheritance;

public class Employee {
    float salary = 40000;

}

class Programmer extends Employee{
    int bonus=10000;

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        System.out.println("programmer salary is: " + programmer1.salary);
        System.out.println("bonus of programmer is: " + programmer1.bonus);
    }
}