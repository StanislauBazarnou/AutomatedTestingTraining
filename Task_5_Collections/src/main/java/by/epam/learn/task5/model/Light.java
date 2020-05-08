package by.epam.learn.task5.model;

public abstract class Light extends ElectricAppliance {

    boolean brightnessAdjustment;

    public Light(String name, int wattage, boolean on, boolean brightnessAdjustment) {
        super(name, wattage, on);
        this.brightnessAdjustment = brightnessAdjustment;
    }

    public boolean isBrightnessAdjustment() {
        return brightnessAdjustment;
    }

    public void setBrightnessAdjustment(boolean brightnessAdjustment) {
        this.brightnessAdjustment = brightnessAdjustment;
    }

}
