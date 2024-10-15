package com.stbasarab.appliances;

public class Microwave extends ElectricalAppliance {
    private final double volume;

    public Microwave(String name, double power, double electromagneticRadiation, double volume) {
        super(name, power, electromagneticRadiation);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", volume=" + this.volume + " }";
    }
}
