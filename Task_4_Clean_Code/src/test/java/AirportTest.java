package Task_4_Clean_Code.src.test.java;

import Task_4_Clean_Code.src.main.java.Airport;
import Task_4_Clean_Code.src.main.java.Planes.ExperimentalPlane;
import Task_4_Clean_Code.src.main.java.Planes.MilitaryPlane;
import Task_4_Clean_Code.src.main.java.Planes.PassengerPlane;
import Task_4_Clean_Code.src.main.java.Planes.Plane;
import Task_4_Clean_Code.src.main.java.models.Characteristic;
import Task_4_Clean_Code.src.main.java.models.ClassificationLevel;
import Task_4_Clean_Code.src.main.java.models.MilitaryType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
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

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", new Characteristic(980, 16100, 70500), 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        boolean flag = false;
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.TRANSPORT)) {
                flag = true;
                break;
            }
        }
        Assert.assertEquals(flag, true);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        System.out.println("TEST testGetPassengerPlaneWithMaxCapacity started!");
        Airport airport = new Airport(planes);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }

    @Test
    public void test3() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();

        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMaxLoadCapacity() > nextPlane.getMaxLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        Assert.assertTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent);
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        boolean flag = false;
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if ((militaryPlane.getType() == MilitaryType.BOMBER)) {
                flag = true;
            }
            else {
                Assert.fail("Test failed!");
            }
        }
        // if not failed
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        boolean hasUnclassifiedPlanes = false;
        for(ExperimentalPlane experimentalPlane : experimentalPlanes){
            if(experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED){
                hasUnclassifiedPlanes = true;
                break;
            }
        }
        Assert.assertFalse(hasUnclassifiedPlanes);
    }
}
