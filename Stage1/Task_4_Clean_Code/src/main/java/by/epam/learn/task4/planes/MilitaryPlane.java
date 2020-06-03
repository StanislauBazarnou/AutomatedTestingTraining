package by.epam.learn.task4.planes;

import by.epam.learn.task4.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryType type;

    public MilitaryPlane(String model, Characteristic characteristic, MilitaryType type) {
        super(model, characteristic);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
