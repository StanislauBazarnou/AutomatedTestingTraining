package by.epam.learn.task4;

import by.epam.learn.task4.models.MilitaryType;
import by.epam.learn.task4.planes.ExperimentalPlane;
import by.epam.learn.task4.planes.MilitaryPlane;
import by.epam.learn.task4.planes.PassengerPlane;
import by.epam.learn.task4.planes.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        if (!passengerPlanes.isEmpty()) {
            return passengerPlanes.stream()
                    .max(Comparator.comparing(PassengerPlane::getPassengersCapacity))
                    .get();
        } else {
            return null;
        }
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public List<Plane> sortByMaxDistance() {
        return planes.stream()
                .sorted(Comparator.comparingInt(plane -> plane.getCharacteristic().getMaxFlightDistance()))
                .collect(Collectors.toList());

    }

    public List<Plane> sortByMaxSpeed() {
        return planes.stream()
                .sorted(Comparator.comparingInt(plane -> plane.getCharacteristic().getMaxSpeed()))
                .collect(Collectors.toList());
    }

    public List<Plane> sortByMaxLoadCapacity() {
        return planes.stream()
                .sorted(Comparator.comparingInt(plane -> plane.getCharacteristic().getMaxLoadCapacity()))
                .collect(Collectors.toList());
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
}