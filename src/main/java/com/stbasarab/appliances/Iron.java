package com.stbasarab.appliances;

/**
 * Represents an iron, inheriting from the ElectricalAppliance class.
 */
public class Iron extends ElectricalAppliance {

    private final double steamPower; // Power of steam produced by the iron

    /**
     * Constructor to initialize the iron.
     *
     * @param name Name of the iron.
     * @param power Power of the iron in watts.
     * @param electromagneticRadiation Electromagnetic radiation of the iron.
     * @param steamPower Power of steam produced by the iron.
     */
    public Iron(String name, double power, double electromagneticRadiation, double steamPower) {
        super(name, power, electromagneticRadiation);
        this.steamPower = steamPower;
    }

    /**
     * Provides a string representation of the iron.
     *
     * @return A string containing the class name and its properties.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", steamPower=" + this.steamPower + " }";
    }
}
