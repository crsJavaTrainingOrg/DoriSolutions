package hu.crs;

import java.util.ArrayList;
import java.util.List;

public class FlightPlanner {
    public List<String> plan(List<String> cities) {

        List<String> plan = new ArrayList<>();

        int flightCount = 1;
        for (String city : cities) {
            while (flightCount % 3 == 0 || flightCount % 5 == 0) {
                if (flightCount % 3 == 0) {
                    plan.add("Wien");
                    flightCount++;
                } else if (flightCount % 5 == 0) {
                    plan.add("Innsbruck");
                    flightCount++;
                }
            }

            plan.add(city);
            flightCount++;
        }

        return plan;
    }
}
