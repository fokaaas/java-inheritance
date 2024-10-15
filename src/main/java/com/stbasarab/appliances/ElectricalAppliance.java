package com.stbasarab.appliances;

public class ElectricalAppliance implements Comparable<ElectricalAppliance> {
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

    public void turnOff() {
        isTurnedOn = false;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    @Override
    public int compareTo(ElectricalAppliance other) {
        return Double.compare(this.power, other.power);
    }

    protected String getInfo() {
        return "name='" + name + '\'' +
                ", power=" + power +
                ", electromagneticRadiation=" + electromagneticRadiation +
                ", isTurnedOn=" + isTurnedOn;
    }

    public double getElectromagneticRadiation() {
        return electromagneticRadiation;
    }
}
