package by.epam.learn.task5.model;

import java.util.Objects;

public class Microwave extends ElectricAppliance {

    boolean convection;

    public Microwave(String name, int wattage, boolean on, boolean convection) {
        super(name, wattage, on);
        this.convection = convection;
    }

    public boolean isConvection() {
        return convection;
    }

    public void setConvection(boolean convection) {
        this.convection = convection;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "name = '" + getName() + '\'' +
                ", wattage = " + getWattage() +
                ", on = " + isOn() +
                ", convection = " + convection +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Microwave microwave = (Microwave) o;
        return convection == microwave.convection;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), convection);
    }

    @Override
    public void isConnected(boolean on) {

    }
}
