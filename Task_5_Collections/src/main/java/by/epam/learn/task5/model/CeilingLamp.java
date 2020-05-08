package by.epam.learn.task5.model;

import java.util.Objects;

public class CeilingLamp extends Light {

    boolean remoteControl;

    public CeilingLamp(String name, int wattage, boolean on, boolean brightnessAdjustment, boolean remoteControl) {
        super(name, wattage, on, brightnessAdjustment);
        this.remoteControl = remoteControl;
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "CeilingLamp{" +
                "name = '" + getName() + '\'' +
                ", wattage = " + getWattage() +
                ", on = " + isOn() +
                ", brightnessAdjustment = " + brightnessAdjustment +
                ", remoteControl = " + remoteControl +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CeilingLamp that = (CeilingLamp) o;
        return remoteControl == that.remoteControl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), remoteControl);
    }
}
