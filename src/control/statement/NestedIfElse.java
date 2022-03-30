package control.statement;

public class NestedIfElse {
    public static void main(String[] args) {
        int i = 10;
        if (i==10){
            //first if statement
        if (i<15)
            System.out.println("i is smaller than 15");
//nested if statement will only be execyted if statement above is true/**/

            if (i<12)
                System.out.println("i is smaller than 12 too");

            else
                System.out.println("i is greater than 15");

        }

    }
}
