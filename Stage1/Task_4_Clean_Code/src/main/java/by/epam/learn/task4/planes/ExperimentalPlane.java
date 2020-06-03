package by.epam.learn.task4.planes;

import by.epam.learn.task4.models.ClassificationLevel;
import by.epam.learn.task4.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, Characteristic characteristic,
                             ExperimentalTypes type, ClassificationLevel classificationLevel) {

        super(model, characteristic);
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
