package by.epam.learn.task5;

import by.epam.learn.task5.model.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final List<ElectricAppliance> APPLIANCES = Arrays.asList(
            new Laptop("Sony VGN-240E", 76, true, 3),
            new Laptop("Lenovo G700", 65, false, 4),
            new Laptop("Lenovo G50", 45, false, 4),
            new DeskLamp("Xiaomi Led Table Lamp", 10, true, true, true),
            new DeskLamp("ARTE LAMP", 100, false, false, false),
            new CeilingLamp("SCENA A2669PL", 100, false, true, true),
            new CeilingLamp("Odeon Light", 100, false, false, false),
            new Microwave("Daewoo", 900, false, false),
            new TvSet("Horizont", 36, false, false));

    public static void main(String[] args) {

        ConsoleMenu consoleMenu = new ConsoleMenu();
        consoleMenu.proceedInput(APPLIANCES);
    }
}
