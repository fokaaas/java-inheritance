package com.stbasarab.appliances;

public class ElectricalAppliance {
    private final String name;
    private final double power;
    private final double electromagneticRadiation;
    private boolean isTurnedOn;

    public ElectricalAppliance(String name, double power, double electromagneticRadiation) {
        this.name = name;
        this.power = power;
        this.electromagneticRadiation = electromagneticRadiation;
        this.isTurnedOn = false;
    }

    public void turnOn() {
        isTurnedOn = true;
    }

    protected String getInfo() {
        return "name='" + name + '\'' +
                ", power=" + power +
                ", electromagneticRadiation=" + electromagneticRadiation +
                ", isTurnedOn=" + isTurnedOn;
    }
}
