package appliances;

import java.util.Objects;

public class ElectricAppliance implements PowerSocket {
    private String name;
    private int wattage;
    private boolean on;

    public ElectricAppliance(String name, int wattage, boolean on) {
        this.name = name;
        this.wattage = wattage;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean connectedToElectricPowerGrid() {
        return true;
    }

    @Override
    public String toString() {
        return "ElectricAppliance{" +
                "name='" + name + '\'' +
                ", wattage=" + wattage +
                ", on=" + on +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricAppliance appliance = (ElectricAppliance) o;
        return wattage == appliance.wattage &&
                on == appliance.on &&
                Objects.equals(name, appliance.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wattage, on);
    }
}
