package Task_4_Clean_Code.src.main.java.Planes;

import Task_4_Clean_Code.src.main.java.models.Characteristic;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacity;

    public PassengerPlane(String model, Characteristic characteristic, int passengersCapacity) {
        super(model, characteristic);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}