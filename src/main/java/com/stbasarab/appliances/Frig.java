package com.stbasarab.appliances;

/**
 * Represents a refrigerator, inheriting from the ElectricalAppliance class.
 */
public class Frig extends ElectricalAppliance {

    private final double height; // Height of the refrigerator
    private final double width;  // Width of the refrigerator

    /**
     * Constructor to initialize the refrigerator.
     *
     * @param name Name of the refrigerator.
     * @param power Power of the refrigerator in watts.
     * @param electromagneticRadiation Electromagnetic radiation of the refrigerator.
     * @param height Height of the refrigerator.
     * @param width Width of the refrigerator.
     */
    public Frig(String name, double power, double electromagneticRadiation, double height, double width) {
        super(name, power, electromagneticRadiation);
        this.height = height;
        this.width = width;
    }

    /**
     * Provides a string representation of the refrigerator.
     *
     * @return A string containing the class name and its properties.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", height=" + this.height + ", width=" + this.width + " }";
    }
}
