package oop.concepts;
// defining Student class main withing the class
public class Student {

    // defining fields
    int id;
    String name;

    //creating main method inside the Student class

    public static void main(String[] args) {
        Student myStudent = new Student(); // creating object off Student
        // printing values of the object
        System.out.println(myStudent.id);
        System.out.println(myStudent.name);
    }

}
