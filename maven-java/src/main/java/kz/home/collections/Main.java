package kz.home.collections;

/*Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе
уровня комфортности. Найти в поезде вагоны, соответствующие заданному
диапазону параметров числа пассажиров.
 */


import kz.home.collections.models.CargoType;
import kz.home.collections.models.WagonType;
import kz.home.collections.wagon.CargoWagon;
import kz.home.collections.wagon.PassengerWagon;
import kz.home.collections.wagon.Wagon;

import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Wagon> wagons = Arrays.asList(
            new PassengerWagon(1,5,5, WagonType.VIP_COMPARTMENT),
            new PassengerWagon(2,36,42, WagonType.RESERVED_SEAT),
            new PassengerWagon(3,18,20, WagonType.COMPARTMENT),
            new PassengerWagon(4,20,26, WagonType.RESERVED_SEAT),
            new PassengerWagon(5,25,30, WagonType.RESERVED_SEAT),
            new PassengerWagon(3,14,16, WagonType.COMPARTMENT),
            new PassengerWagon(5,35,36, WagonType.RESERVED_SEAT),
            new CargoWagon(6,500, CargoType.MAIL_WAGON),
            new CargoWagon(7,1500, CargoType.OIL_WAGON),
            new CargoWagon(8,2500, CargoType.CARGO_WAGON)
    );

    public static void main(String[] args) {

        PassengerTrain passengerTrain = new PassengerTrain(wagons);

        System.out.println(passengerTrain.getPassengerWagons());

        System.out.println(passengerTrain.getPassengersAndCarriages());

        System.out.println(passengerTrain.sortByComfort());

        System.out.println(PassengerTrain.rangeForNumberOfPassengers(passengerTrain, 15, 34));

    }
}
