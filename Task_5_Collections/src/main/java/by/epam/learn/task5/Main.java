package by.epam.learn.task5;

import by.epam.learn.task5.model.ElectricAppliance;
import by.epam.learn.task5.model.Laptop;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final List<ElectricAppliance> APPLIANCES = Arrays.asList(
            new Laptop("Sony VGN-240E", 76, true),
            new Laptop("Lenovo G700", 65, true),
            new Laptop("Lenovo G50", 45, false),
            new ElectricAppliance("Desk lamp", 100, true),
            new ElectricAppliance("Ceiling lamp", 50, false),
            new ElectricAppliance("Microwave", 900, false),
            new ElectricAppliance("TV set", 45, true),
            new ElectricAppliance("Iron", 3000, false));

    public static void main(String[] args) {

        ConsoleMenu consoleMenu = new ConsoleMenu();
        consoleMenu.launchMethodBasedOnUserInput(APPLIANCES);
    }
}
