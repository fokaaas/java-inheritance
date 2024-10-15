package com.stbasarab.appliances;

public class Monitor extends ElectricalAppliance {
    private final double diagonal;

    public Monitor(String name, double power, double electromagneticRadiation, double diagonal) {
        super(name, power, electromagneticRadiation);
        this.diagonal = diagonal;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", diagonal=" + this.diagonal + " }";
    }
}
