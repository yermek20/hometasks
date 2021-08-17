package kz.home.collections.wagon;

abstract public class Wagon {

    private int id;
    private int carriage;

    public Wagon(int id, int carriage) {
        this.id = id;
        this.carriage = carriage;
    }

    public int getId() { return id; }

    public int getWeight() {
        return id;
    }

    public int getCarriage() {
        return carriage;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "id=" + id +
                ", carriage=" + carriage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wagon wagon = (Wagon) o;

        if (id != wagon.id) return false;
        return carriage == wagon.carriage;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + carriage;
        return result;
    }
}
