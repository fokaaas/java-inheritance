package com.stbasarab.appliances;

/**
 * Represents a computer monitor, inheriting from the ElectricalAppliance class.
 */
public class Monitor extends ElectricalAppliance {

    private final double diagonal; // Diagonal size of the monitor in inches

    /**
     * Constructor to initialize the monitor.
     *
     * @param name Name of the monitor.
     * @param power Power of the monitor in watts.
     * @param electromagneticRadiation Electromagnetic radiation of the monitor.
     * @param diagonal Diagonal size of the monitor in inches.
     */
    public Monitor(String name, double power, double electromagneticRadiation, double diagonal) {
        super(name, power, electromagneticRadiation);
        this.diagonal = diagonal;
    }

    /**
     * Provides a string representation of the monitor.
     *
     * @return A string containing the class name and its properties.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +
                "{ " + getInfo() + ", diagonal=" + this.diagonal + " }";
    }
}
