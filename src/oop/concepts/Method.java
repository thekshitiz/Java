package oop.concepts;

public class Method {
// creating method
    public int addNumber(int x, int y){
        int addition = x+y;
        return addition;
    }

    public static void main(String[] args) {
        int j = 10;
        int k = 25;
        Method methodObj = new Method();
        int result = methodObj.addNumber(j,k);
        System.out.println("sum of x+y: " + result);
    }
}
