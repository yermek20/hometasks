package kz.home.collections.wagon;

import kz.home.collections.models.WagonType;

public class PassengerWagon extends Wagon {

    private int passengersCapacity;
    private WagonType wagonType;

    public PassengerWagon(int id, int carriage, int passengersCapacity, WagonType wagonType) {
        super(id, carriage);
        this.passengersCapacity = passengersCapacity;
        this.wagonType = wagonType;
    }

    public static PassengerWagon isPassenger(PassengerWagon pt) {
        if (pt.getClass() == PassengerWagon.class) {
            return pt;
        }
        return null;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                ", wagonType=" + wagonType +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerWagon that = (PassengerWagon) o;

        if (passengersCapacity != that.passengersCapacity) return false;
        return wagonType == that.wagonType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengersCapacity;
        result = 31 * result + (wagonType != null ? wagonType.hashCode() : 0);
        return result;
    }
}
