package com.stbasarab.appliances;

/**
 * Represents a microwave oven, inheriting from the ElectricalAppliance class.
 */
public class Microwave extends ElectricalAppliance {

    private final double volume; // Volume of the microwave in liters

    /**
     * Constructor to initialize the microwave.
     *
     * @param name Name of the microwave.
     * @param power Power of the microwave in watts.
     * @param electromagneticRadiation Electromagnetic radiation of the microwave.
     * @param volume Volume of the microwave in liters.
     */
    public Microwave(String name, double power, double electromagneticRadiation, double volume) {
        super(name, power, electromagneticRadiation);
        this.volume = volume;
    }

    /**
     * Provides a string representation of the microwave.
     *
     * @return A string containing the class name and its properties.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", volume=" + this.volume + " }";
    }
}
