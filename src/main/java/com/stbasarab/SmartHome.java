package com.stbasarab;

import com.stbasarab.appliances.ElectricalAppliance;
import java.util.Arrays;

public class SmartHome {
    private final ElectricalAppliance[] appliances;

    public SmartHome(ElectricalAppliance[] appliances) {
        this.appliances = appliances;
    }

    public void turnOnAppliances(String[] names) {
        for (String name : names) {
            for (ElectricalAppliance appliance : appliances) {
                if (appliance.getName().equals(name)) {
                    appliance.turnOn();
                }
            }
        }
    }

    public void turnOffAllAppliances() {
        for (ElectricalAppliance appliance : appliances) {
            appliance.turnOff();
        }
    }

    public void printAllAppliances(ElectricalAppliance[] appliances) {
        for (ElectricalAppliance appliance : appliances) {
            System.out.println(appliance);
        }
    }

    public double calculateTotalPower() {
        double totalPower = 0;
        for (ElectricalAppliance appliance : appliances) {
            if (appliance.isTurnedOn()) {
                totalPower += appliance.getPower();
            }
        }
        return totalPower;
    }

    public ElectricalAppliance[] sortAppliancesByPower() {
        Arrays.sort(appliances);
        return appliances;
    }

    public ElectricalAppliance[] findAppliancesInRadiationRange(double min, double max) {
        return Arrays.stream(appliances)
                .filter(appliance -> appliance.getElectromagneticRadiation() >= min &&
                        appliance.getElectromagneticRadiation() <= max)
                .toArray(ElectricalAppliance[]::new);
    }
}
