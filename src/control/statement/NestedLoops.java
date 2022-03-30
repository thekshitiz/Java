package control.statement;

public class NestedLoops {
    public static void main(String[] args) {
        int week = 3;
        int days=7;

        //outer loop
        for (int i =1; i<=week;i++){
            System.out.println("week: "+ i);

//       inner loop
        for(int j =1;j<=days;++j){
            System.out.println("day: "+ j);}
        }
    }
}
