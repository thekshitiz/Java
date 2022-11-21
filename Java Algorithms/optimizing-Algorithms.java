public class Algorithms {

    public static int findMaximum(int a, int b, int c) {
        if (a > b) {
            if (a > c || a == c) {
                return a;
            }
        }

        if (b > c) {
            return b;
        }

        return c;
    }

    // optimizing the above code

    public static int findMaximum2(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max){
            max = c;
        }

        return max;

}

// new algorithm only does 2 comparision per call and is more readable

public static void main (String[] args) {

    System.out.println(findMaximum2(1, 2, 6));
    System.out.println(findMaximum2(100, 8, 1));
    System.out.println(findMaximum2(3, 17, 3));
    System.out.println(findMaximum2(1, 1, 92));
    System.out.println(findMaximum2(1, 39, 9));
}
}




//     public static void main(String[] args) {

//         System.out.println(findMaximum(1, 2, 3));
//         System.out.println(findMaximum(8, 8, 1));
//         System.out.println(findMaximum(3, 2, 3));
//         System.out.println(findMaximum(1, 1, 9));
//         System.out.println(findMaximum(1, 9, 9));
//     }
// }
