package by.epam.learn.task5.model;

import java.util.Objects;

public class TvSet extends ElectricAppliance {

    boolean wiFi;

    public TvSet(String name, int wattage, boolean on, boolean wiFi) {
        super(name, wattage, on);
        this.wiFi = wiFi;
    }

    public boolean isWiFi() {
        return wiFi;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }

    @Override
    public String toString() {
        return "TvSet{" +
                "name = '" + getName() + '\'' +
                ", wattage = " + getWattage() +
                ", on = " + isOn() +
                ", wiFi=" + wiFi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TvSet tvSet = (TvSet) o;
        return wiFi == tvSet.wiFi;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wiFi);
    }
}
