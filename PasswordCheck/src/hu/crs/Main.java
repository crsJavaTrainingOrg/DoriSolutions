package hu.crs;

public class Main {

    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        boolean result0 = passwordChecker.check(new char[]{'a', 'b', 'c', 'd', 'e'});
        if (result0 != false) {
            System.out.println("Result 0 should be false because it's too short");
        } else {
            System.out.println("Result 0 is OK");
        }

        boolean result1 = passwordChecker.check(new char[]{'a', 'b', 'c', 'd', 'e', 'f'});
        if (result1 != false) {
            System.out.println("Result 1 should be false because it does not contain special character");
        } else {
            System.out.println("Result 1 is OK");
        }

        boolean result2 = passwordChecker.check(new char[]{'a', 'b', 'c', 'd', 'e', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o'});
        if (result2 != false) {
            System.out.println("Result 2 should be false because it's too long");
        } else {
            System.out.println("Result 2 is OK");
        }

        boolean result3 = passwordChecker.check(new char[]{'a', 'b', 'c', 'd', 'e', '@'}) == true;
        if (result3) {
            System.out.println("Result 3 is OK");
        } else {
            System.out.println("Result 3 is INCORRECT");
        }

    }
}
