package by.epam.learn.task4.planes;

import java.util.Objects;

abstract public class Plane {
    String model;
    Characteristic characteristic;

    public Plane(String model, Characteristic characteristic) {
        this.model = model;
        this.characteristic = characteristic;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(model, plane.model) &&
                Objects.equals(characteristic, plane.characteristic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, characteristic);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", characteristic=" + characteristic +
                '}';
    }
}
