package hu.crs;

public class Main {

    public static void main(String[] args) {

        if (Sum.sum1(1, 10) == 55) {
            System.out.println("Sum1's result is OK");
        } else {
            System.out.println("Sum1's result is INCORRECT");
        }

        if (Sum.sum2(1, 10) == 55) {
            System.out.println("Sum2's result is OK");
        } else {
            System.out.println("Sum2's result is INCORRECT");
        }
    }
}
