package by.epam.learn.task4;

import by.epam.learn.task4.models.ClassificationLevel;
import by.epam.learn.task4.models.ExperimentalTypes;
import by.epam.learn.task4.models.MilitaryType;
import by.epam.learn.task4.planes.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @ParameterizedTest
    @MethodSource("providePassengerPlanes")
    void testGetPassengerPlane(Plane one, Plane two, List<Plane> expectedList) {
        Airport airport = new Airport(Arrays.asList(one, two));
        assertEquals(expectedList, airport.getPassengerPlane());
    }

    private static Stream<Arguments> providePassengerPlanes() {
        Plane passengerPlane = new PassengerPlane("Airbus A330", new Characteristic(990, 14800, 80500), 222);
        Plane militaryPlane = new MilitaryPlane("B-2 Spirit", new Characteristic(1030, 22000, 70000), MilitaryType.BOMBER);
        List<Plane> expectedList = Arrays.asList(passengerPlane);

        return Stream.of(
                Arguments.of(passengerPlane, militaryPlane, expectedList),
                Arguments.of(null, null, Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("providePassengerPlaneWithMaxCapacity")
    void testGetPassengerPlaneWithMaxCapacity(Plane one, Plane two, Plane expected) {
        Airport airport = new Airport(Arrays.asList(one, two));
        assertEquals(expected, airport.getPassengerPlaneWithMaxPassengersCapacity());
    }

    private static Stream<Arguments> providePassengerPlaneWithMaxCapacity() {
        Plane planeWithMinCapacity = new PassengerPlane("Boeing-737-800", new Characteristic(940, 12300, 63870), 192);
        Plane planeWithMaxCapacity = new PassengerPlane("Airbus A330", new Characteristic(990, 14800, 80500), 222);
        return Stream.of(
                Arguments.of(planeWithMinCapacity, planeWithMaxCapacity, planeWithMaxCapacity),
                Arguments.of(null, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMilitaryPlanes")
    void testGetMilitaryPlanes(Plane one, Plane two, List<Plane> expectedList) {
        Airport airport = new Airport(Arrays.asList(one, two));
        assertEquals(expectedList, airport.getMilitaryPlanes());
    }

    private static Stream<Arguments> provideMilitaryPlanes() {
        Plane passengerPlane = new PassengerPlane("Airbus A330", new Characteristic(990, 14800, 80500), 222);
        Plane militaryPlane = new MilitaryPlane("B-2 Spirit", new Characteristic(1030, 22000, 70000), MilitaryType.BOMBER);
        List<Plane> expectedList = Arrays.asList(militaryPlane);
        return Stream.of(
                Arguments.of(passengerPlane, militaryPlane, expectedList),
                Arguments.of(null, null, Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("provideMilitaryTransportPlanes")
    void testGetTransportMilitaryPlanes(Plane one, Plane two, List<Plane> expectedList) {
        Airport airport = new Airport(Arrays.asList(one, two));
        assertEquals(expectedList, airport.getTransportMilitaryPlanes());
    }

    private static Stream<Arguments> provideMilitaryTransportPlanes() {
        Plane fighterPlane = new MilitaryPlane("F-22", new Characteristic(1550, 13000, 11000), MilitaryType.FIGHTER);
        Plane transportPlane = new MilitaryPlane("C-130 Hercules", new Characteristic(650, 5000, 110000), MilitaryType.TRANSPORT);
        List<Plane> expectedList = Arrays.asList(transportPlane);
        return Stream.of(
                Arguments.of(fighterPlane, transportPlane, expectedList),
                Arguments.of(null, null, Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("provideBomberPlanes")
    void testGetBomberMilitaryPlanes(Plane one, Plane two, List<Plane> expectedPlanes) {
        Airport airport = new Airport(Arrays.asList(one, two));
        assertEquals(expectedPlanes, airport.getBomberMilitaryPlanes());
    }

    private static Stream<Arguments> provideBomberPlanes() {
        Plane notBomberPlane = new PassengerPlane("Bombardier CS300", new Characteristic(920, 11000, 60700), 196);
        Plane bomberPlane = new MilitaryPlane("B-1B Lancer", new Characteristic(1050, 21000, 1000), MilitaryType.BOMBER);
        List<Plane> expectedPlanes = Arrays.asList(bomberPlane);
        return Stream.of(
                Arguments.of(notBomberPlane, bomberPlane, expectedPlanes),
                Arguments.of(null, null, Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("provideExperimentalPlanes")
    void testGetExperimentalPlanes(Plane one, Plane two, List<Plane> expectedList) {
        Airport airport = new Airport(Arrays.asList(one, two));
        assertEquals(expectedList, airport.getExperimentalPlanes());
    }

    private static Stream<Arguments> provideExperimentalPlanes() {
        Plane passengerPlane = new PassengerPlane("Bombardier CS300", new Characteristic(920, 11000, 60700), 196);
        Plane experimentalPlane = new ExperimentalPlane("B-1B Lancer", new Characteristic(1050, 21000, 1000), ExperimentalTypes.HYPERSONIC, ClassificationLevel.SECRET);
        List<Plane> expectedList = Arrays.asList(experimentalPlane);
        return Stream.of(
                Arguments.of(passengerPlane, experimentalPlane, expectedList),
                Arguments.of(null, null, Collections.emptyList())
        );
    }

    @Test
    public void testSortByMaxDistance() {
        Plane planeWithMaxDistance = new MilitaryPlane("B-1B Lancer", new Characteristic(1050, 21000, 1000), MilitaryType.BOMBER);
        Plane planeWithMinDistance = new PassengerPlane("Bombardier CS300", new Characteristic(920, 11000, 60700), 196);
        List<Plane> allPlanes = Arrays.asList(planeWithMinDistance, planeWithMaxDistance);
        List<Plane> expectedList = Arrays.asList(planeWithMinDistance, planeWithMaxDistance);
        Airport airport = new Airport(allPlanes);
        assertEquals(expectedList, airport.sortByMaxDistance());
    }

    @Test
    public void sortByMaxSpeed() {
        Plane planeWithMaxSpeed = new MilitaryPlane("B-1B Lancer", new Characteristic(1050, 21000, 1000), MilitaryType.BOMBER);
        Plane planeWithMinSpeed = new PassengerPlane("Bombardier CS300", new Characteristic(920, 11000, 60700), 196);
        List<Plane> allPlanes = Arrays.asList(planeWithMinSpeed, planeWithMaxSpeed);
        List<Plane> expectedList = Arrays.asList(planeWithMinSpeed, planeWithMaxSpeed);
        Airport airport = new Airport(allPlanes);
        assertEquals(expectedList, airport.sortByMaxSpeed());
    }

    @Test
    public void testSortByMaxLoadCapacity() {
        Plane maxCapacityPlane = new PassengerPlane("Bombardier CS300", new Characteristic(920, 11000, 60700), 196);
        Plane minCapacityPlane = new MilitaryPlane("B-1B Lancer", new Characteristic(1050, 21000, 1000), MilitaryType.BOMBER);
        List<Plane> allPlanes = Arrays.asList(maxCapacityPlane, minCapacityPlane);
        Airport airport = new Airport(allPlanes);
        List<Plane> expectedList = Arrays.asList(minCapacityPlane, maxCapacityPlane);
        assertEquals(expectedList, airport.sortByMaxLoadCapacity());
    }
}
