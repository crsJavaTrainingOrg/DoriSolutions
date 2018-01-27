package hu.crs;

import java.math.BigDecimal;
import java.util.List;

public class DistanceCalculator {

    public static double calculateDistance(double[] numbers) {
        double sum = 0;
        int i = 0;
        while (i < numbers.length - 1) {
            sum += ((numbers[i] + numbers[i + 1]) / 2);
            i++;
        }

        return sum;
    }

    public static BigDecimal calculateDistance2(List<BigDecimal> numbers) {
        BigDecimal sum = BigDecimal.ZERO;
        int i = 0;
        while (i < numbers.size() - 1) {
            BigDecimal elementSum = numbers.get(i).add(numbers.get(i + 1));
            BigDecimal average = elementSum.divide(new BigDecimal("2"));
            sum = sum.add(average);
            i++;
        }

        return sum;
    }
}
