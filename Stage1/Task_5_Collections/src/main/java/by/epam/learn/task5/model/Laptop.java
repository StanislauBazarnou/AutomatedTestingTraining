package by.epam.learn.task5.model;

import java.util.Objects;

public class Laptop extends ElectricAppliance {

    int ramMemory;

    public Laptop(String name, int wattage, boolean on, int ramMemory) {
        super(name, wattage, on);
        this.ramMemory = ramMemory;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name = '" + getName() + '\'' +
                ", wattage = " + getWattage() +
                ", on = " + isOn() +
                ", ramMemory = " + ramMemory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return ramMemory == laptop.ramMemory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ramMemory);
    }
}
