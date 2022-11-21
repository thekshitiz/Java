
// password complexity using anyMatch method, which will return true if any of the requirement matches

public class Algorithms {

    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    // s.chars().anyMatch(c -> Character.isUpperCase(c) || Character.isLowerCase(c)
    // || Character.isDigit(c));

    public static void main(String[] args) {
        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println(isPasswordComplex("hellO"));
        System.out.println(isPasswordComplex("HeLLo"));
        System.out.println(isPasswordComplex("hello"));
        System.out.println(isPasswordComplex(" "));
    }
}
