package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;

public class experimentalPlane extends Plane{

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public experimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        experimentalPlane that = (experimentalPlane) o;
        return experimentalTypes == that.experimentalTypes && classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalTypes, classificationLevel);
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + this.getModel() + '\'' +
                '}';
    }
}
