package com.stbasarab;

import com.stbasarab.appliances.*;

/**
 * Main class to run the SmartHome application.
 */
public class Main {

    /**
     * Main method to run the SmartHome application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Initialize an array of electrical appliances
        ElectricalAppliance[] appliances = {
                new Monitor("Samsung", 100, 0.1, 24),
                new Iron("Philips", 2000, 0.4, 200),
                new Frig("Bosch", 200, 0.2, 180, 60),
                new Microwave("LG", 1500, 0.3, 30),
        };

        // Create a SmartHome instance with the array of appliances
        SmartHome smartHome = new SmartHome(appliances);

        // Print all appliances
        System.out.println("All appliances:");
        smartHome.printAllAppliances();

        // Turn on some appliances and print the updated list
        System.out.println("\nSome appliances after turning on:");
        smartHome.turnOnAppliances(new String[]{"Samsung", "Philips", "Bosch"});
        smartHome.printAllAppliances();

        // Calculate and print the total power consumption of turned-on appliances
        System.out.println("\nTotal power: " + smartHome.calculateTotalPower());

        // Sort appliances by power and print the sorted list
        System.out.println("\nAppliances after sorting by power:");
        smartHome.sortAppliancesByPower();
        smartHome.printAllAppliances();

        // Find and print appliances within a specified radiation range
        System.out.println("\nAppliances in radiation range [0.1, 0.3]:");
        ElectricalAppliance[] appliancesInRadiationRange = smartHome.findAppliancesInRadiationRange(0.1, 0.3);
        for (ElectricalAppliance appliance : appliancesInRadiationRange) {
            System.out.println(appliance);
        }

        // Turn off all appliances
        smartHome.turnOffAllAppliances();
    }
}
