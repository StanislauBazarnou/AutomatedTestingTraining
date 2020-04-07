package Task_4_Clean_Code.src.main.java.models;

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

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
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
