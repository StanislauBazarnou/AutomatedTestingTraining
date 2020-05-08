package by.epam.learn.task5.model;

public abstract class ElectricAppliance implements PowerSocket {
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

    public void isConnected(boolean on) {
    }
}