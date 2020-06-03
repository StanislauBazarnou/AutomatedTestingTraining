package by.epam.learn.task5.model;

import java.util.Objects;

public class DeskLamp extends Light {

    boolean withBattery;

    public DeskLamp(String name, int wattage, boolean on, boolean brightnessAdjustment, boolean withBattery) {
        super(name, wattage, on, brightnessAdjustment);
        this.withBattery = withBattery;
    }

    public boolean isWithBattery() {
        return withBattery;
    }

    public void setWithBattery(boolean withBattery) {
        this.withBattery = withBattery;
    }

    @Override
    public String toString() {
        return "DeskLamp{" +
                "name = '" + getName() + '\'' +
                ", wattage = " + getWattage() +
                ", on = " + isOn() +
                ", brightnessAdjustment = " + brightnessAdjustment +
                ", withBattery = " + withBattery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DeskLamp deskLamp = (DeskLamp) o;
        return withBattery == deskLamp.withBattery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), withBattery);
    }
}
