package com.stbasarab;

import com.stbasarab.appliances.ElectricalAppliance;
import java.util.Arrays;

/**
 * Represents a smart home that manages a collection of electrical appliances.
 */
public class SmartHome {
    private final ElectricalAppliance[] appliances; // Array of electrical appliances

    /**
     * Constructor to initialize the smart home with a set of appliances.
     *
     * @param appliances Array of electrical appliances.
     */
    public SmartHome(ElectricalAppliance[] appliances) {
        this.appliances = appliances;
    }

    /**
     * Turns on appliances specified by their names.
     *
     * @param names Array of appliance names to be turned on.
     */
    public void turnOnAppliances(String[] names) {
        for (String name : names) {
            for (ElectricalAppliance appliance : appliances) {
                if (appliance.getName().equals(name)) {
                    appliance.turnOn();
                }
            }
        }
    }

    /**
     * Turns off all appliances in the smart home.
     */
    public void turnOffAllAppliances() {
        for (ElectricalAppliance appliance : appliances) {
            appliance.turnOff();
        }
    }

    /**
     * Prints the details of all appliances in the smart home.
     */
    public void printAllAppliances() {
        for (ElectricalAppliance appliance : appliances) {
            System.out.println(appliance);
        }
    }

    /**
     * Calculates the total power consumption of all turned-on appliances.
     *
     * @return Total power consumption in watts.
     */
    public double calculateTotalPower() {
        double totalPower = 0;
        for (ElectricalAppliance appliance : appliances) {
            if (appliance.isTurnedOn()) {
                totalPower += appliance.getPower();
            }
        }
        return totalPower;
    }

    /**
     * Sorts the appliances by their power consumption in ascending order.
     */
    public void sortAppliancesByPower() {
        Arrays.sort(appliances);
    }

    /**
     * Finds appliances within a specified range of electromagnetic radiation.
     *
     * @param min Minimum radiation value.
     * @param max Maximum radiation value.
     * @return An array of appliances that fall within the specified radiation range.
     */
    public ElectricalAppliance[] findAppliancesInRadiationRange(double min, double max) {
        return Arrays.stream(appliances)
                .filter(appliance -> appliance.getElectromagneticRadiation() >= min &&
                        appliance.getElectromagneticRadiation() <= max)
                .toArray(ElectricalAppliance[]::new);
    }
}
