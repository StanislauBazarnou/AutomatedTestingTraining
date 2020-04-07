package Task_4_Clean_Code.src.main.java.Planes;

import Task_4_Clean_Code.src.main.java.models.Characteristic;
import Task_4_Clean_Code.src.main.java.models.ClassificationLevel;
import Task_4_Clean_Code.src.main.java.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, Characteristic characteristic,
                             ExperimentalTypes type, ClassificationLevel classificationLevel) {

        super(model, characteristic);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
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
