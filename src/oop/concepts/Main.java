package oop.concepts;

public class Main {
    public static void main(String[] args) {

        // creating objects

        Cat thor = new Cat();
        Cat rambo = new Cat();

        // defining thor cat
        thor.name = "thor";
        thor.age = 5;
        thor.breed = "russian";
        thor.color = "brown";

        System.out.println(thor.name + " is a " + thor.breed + " and is in " + thor.color );
        thor.sleep();



        // defining rambo cat
        rambo.name="rambo";
        rambo.age = 3;
        rambo.breed="nepali";
        rambo.color="black";

        rambo.play();
    }
}

