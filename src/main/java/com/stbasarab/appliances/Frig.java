package com.stbasarab.appliances;

public class Frig extends ElectricalAppliance {
    private final double height;
    private final double width;

    public Frig(String name, double power, double electromagneticRadiation, double height, double width) {
        super(name, power, electromagneticRadiation);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", height=" + this.height + ", width=" + this.width + " }";
    }
}
