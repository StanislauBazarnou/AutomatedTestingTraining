package Task_4_Clean_Code.src.main.java;

import Task_4_Clean_Code.src.main.java.Planes.MilitaryPlane;
import Task_4_Clean_Code.src.main.java.Planes.PassengerPlane;
import Task_4_Clean_Code.src.main.java.Planes.Plane;
import Task_4_Clean_Code.src.main.java.models.Characteristic;
import Task_4_Clean_Code.src.main.java.models.MilitaryType;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", new Characteristic(900, 12000, 60500), 164),
            new PassengerPlane("Boeing-737-800", new Characteristic(940, 12300, 63870), 192),
            new PassengerPlane("Boeing-747", new Characteristic(980, 16100, 70500), 242),
            new PassengerPlane("Airbus A320", new Characteristic( 930, 11800, 65500), 188),
            new PassengerPlane("Airbus A330", new Characteristic( 990, 14800, 80500), 222),
            new PassengerPlane("Embraer 190", new Characteristic(870, 8100, 30800), 64),
            new PassengerPlane("Sukhoi Superjet 100", new Characteristic(870, 11500, 50500), 140),
            new PassengerPlane("Bombardier CS300", new Characteristic(920, 11000, 60700), 196),
            new MilitaryPlane("B-1B Lancer", new Characteristic(1050, 21000, 80000), MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", new Characteristic(1030, 22000, 70000), MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", new Characteristic(1000, 20000, 80000), MilitaryType.BOMBER),
            new MilitaryPlane("F-15", new Characteristic(1500, 12000, 10000), MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", new Characteristic(1550, 13000, 11000), MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", new Characteristic(650, 5000, 110000), MilitaryType.TRANSPORT)
    );

    public static void main(String[] args) {
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPasPl());
        System.out.println("Military airport sorted by max distance: " + militaryAirport
                .sortByMaxDistance()
                .toString());
        System.out.println("Passenger airport sorted by max speed: " + passengerAirport
                .sortByMaxSpeed()
                .toString());

        System.out.println("Plane with max passenger capacity: " + passengerAirport.getPassengerPlaneWithMaxPassengersCapacity());
    }
}
