package hu.crs;

import java.util.ArrayList;
import java.util.List;

public class FlightPlanner {
    public List<String> plan(List<String> originalPlan) {

        List<String> plan = new ArrayList<>();

        int originalPlanIndex = 0;
        int travelCounter = 1;
        while (originalPlanIndex < originalPlan.size()) {
            if (travelCounter % 3 == 0) {
                plan.add("Wien");
                travelCounter++;
            } else if (travelCounter % 5 == 0) {
                plan.add("Innsbruck");
                travelCounter++;
            } else {
                plan.add(originalPlan.get(originalPlanIndex));
                originalPlanIndex++;
                travelCounter++;
            }
        }
        return plan;
    }
}
