package com.stbasarab.appliances;

public class Iron extends ElectricalAppliance {
    private final double steamPower;

    public Iron(String name, double power, double electromagneticRadiation, double steamPower) {
        super(name, power, electromagneticRadiation);
        this.steamPower = steamPower;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", steamPower=" + this.steamPower + " }";
    }
}
