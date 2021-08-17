package kz.home.collections.wagon;

import kz.home.collections.models.CargoType;

public class CargoWagon extends Wagon {

   private CargoType cargoType;

    public CargoWagon(int id, int carriage, CargoType cargoType) {
        super(id, carriage);
        this.cargoType = cargoType;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return "CargoWagon{" +
                "cargoType=" + cargoType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CargoWagon that = (CargoWagon) o;

        return cargoType == that.cargoType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cargoType != null ? cargoType.hashCode() : 0);
        return result;
    }
}
