package hu.crs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("New York");
        cities.add("Toronto");
        cities.add("Hong Kong");

        FlightPlanner flightPlanner = new FlightPlanner();
        List<String> plan = flightPlanner.plan(cities);

        if (plan.get(0).equals("Tokyo") &&
                plan.get(1).equals("New York") &&
                plan.get(2).equals("Wien") &&
                plan.get(3).equals("Toronto") &&
                plan.get(4).equals("Innsbruck") &&
                plan.get(5).equals("Wien") &&
                plan.get(6).equals("Hong Kong")
                ) {
            System.out.println("Flight plan is OK");
        } else {
            System.out.println("Flight plan is INCORRECT");
        }

        for (int i = 0; i < plan.size(); i++) {
            System.out.println(i + 1 + " city is: "+ plan.get(i));
        }
    }
}
