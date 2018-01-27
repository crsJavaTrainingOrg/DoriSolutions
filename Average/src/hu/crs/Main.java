package hu.crs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double result = DistanceCalculator.calculateDistance(new double[] {0.4, 1.6, 2.0, 2.1, 4.5});
        if (result == 8.15) {
            System.out.println("Result is OK");
        } else {
            System.out.println("Result is INCORRECT: " + result);
        }

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("0.4"));
        numbers.add(new BigDecimal("1.6"));
        numbers.add(new BigDecimal("2.0"));
        numbers.add(new BigDecimal("2.1"));
        numbers.add(new BigDecimal("4.5"));

        BigDecimal result1 = DistanceCalculator.calculateDistance2(numbers);
        if (result1.equals(new BigDecimal("8.15"))) {
            System.out.println("Result is OK");
        } else {
            System.out.println("Result is INCORRECT: " + result1);
        }
    }
}
