package com.stbasarab;

import com.stbasarab.appliances.*;

public class Main {
    public static void main(String[] args) {
        ElectricalAppliance[] appliances = {
                new Monitor("Samsung", 100, 0.1, 24),
                new Iron("Philips", 2000, 0.4, 200),
                new Frig("Bosch", 200, 0.2, 180, 60),
                new Microwave("LG", 1500, 0.3, 30),
        };

        SmartHome smartHome = new SmartHome(appliances);

        System.out.println("All appliances:");
        smartHome.printAllAppliances();

        System.out.println("\nSome appliances after turning on:");
        smartHome.turnOnAppliances(new String[]{"Samsung", "Philips", "Bosch"});
        smartHome.printAllAppliances();

        System.out.println("\nTotal power: " + smartHome.calculateTotalPower());

        System.out.println("\nAppliances after sorting by power:");
        smartHome.sortAppliancesByPower();
        smartHome.printAllAppliances();

        System.out.println("\nAppliances in radiation range [0.1, 0.3]:");
        ElectricalAppliance[] appliancesInRadiationRange = smartHome.findAppliancesInRadiationRange(0.1, 0.3);
        for (ElectricalAppliance appliance : appliancesInRadiationRange) {
            System.out.println(appliance);
        }

        smartHome.turnOffAllAppliances();
    }
}