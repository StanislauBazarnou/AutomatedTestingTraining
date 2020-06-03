package by.epam.learn.task4.planes;

import java.util.Objects;

public class Characteristic {
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Characteristic(int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characteristic that = (Characteristic) o;
        return maxSpeed == that.maxSpeed &&
                maxFlightDistance == that.maxFlightDistance &&
                maxLoadCapacity == that.maxLoadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, maxFlightDistance, maxLoadCapacity);
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }
}
