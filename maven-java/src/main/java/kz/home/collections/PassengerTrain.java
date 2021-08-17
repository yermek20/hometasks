package kz.home.collections;

import kz.home.collections.wagon.PassengerWagon;
import kz.home.collections.wagon.Wagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PassengerTrain {
    private List<? extends Wagon> wagons;

    public PassengerTrain(List<? extends Wagon> wagons) {
        this.wagons = wagons;
    }

    public List<PassengerWagon> getPassengerWagons() {
        List<PassengerWagon> passengerWagons = new ArrayList<>();
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassengerWagon) {
                passengerWagons.add((PassengerWagon) wagon);
            }
        }
        return passengerWagons;
    }

    public String getPassengersAndCarriages() {
        int passengers = 0;
        int carriage = 0;
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassengerWagon) {
                passengers += ((PassengerWagon) wagon).getPassengersCapacity();
                carriage += wagon.getCarriage();
            }
        }
        return "Passengers amount is: " + passengers + "\nCarriage amount is: " + carriage;
    }

    public List<PassengerWagon> sortByComfort() {
        List<PassengerWagon> passengerWagons = new ArrayList<>();
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassengerWagon) {
                passengerWagons.add((PassengerWagon) wagon);
            }
        }

        Collections.sort(passengerWagons, new Comparator<Wagon>() {
            @Override
            public int compare(Wagon o1, Wagon o2) {
                PassengerWagon passengerWagon1 = (PassengerWagon) o1;
                PassengerWagon passengerWagon2 = (PassengerWagon) o2;
                if (passengerWagon1.getWagonType() == passengerWagon2.getWagonType()) return 0;
                int dif = passengerWagon1.getWagonType().ordinal() - passengerWagon2.getWagonType().ordinal();
                return dif / (Math.abs(dif));
            }
        });
        return passengerWagons;
    }

    public static List<PassengerWagon> rangeForNumberOfPassengers(PassengerTrain train, int left, int right) {
        List<PassengerWagon> wagons = new ArrayList<>();
        if(left < 0 || right < 0 || left > right) {
            throw new IllegalArgumentException();
        }
        PassengerWagon pw;
        for (PassengerWagon pt : train.getPassengerWagons()) {
            if((pw = PassengerWagon.isPassenger(pt)) != null) {
                if (pw.getPassengersCapacity() >= left && pw.getPassengersCapacity() <= right)
                    wagons.add(pw);
            }
        }
        return wagons;
    }

    @Override
    public String toString() {
        return "PassengerTrain{" +
                "wagons=" + wagons +
                '}';
    }
}
