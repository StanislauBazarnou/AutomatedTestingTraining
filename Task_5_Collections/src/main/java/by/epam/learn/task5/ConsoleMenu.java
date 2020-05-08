package by.epam.learn.task5;

import by.epam.learn.task5.model.ElectricAppliance;
import by.epam.learn.task5.util.ApplianceUtil;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

    Scanner scanner = new Scanner(System.in);

    private void printConsoleMenu() {
        String consoleMenu = "\nPlease, choose from the following options:" +
                "\n0. Exit" +
                "\n1. Calculate the current power consumption" +
                "\n2. Sort appliances by power" +
                "\n3. Search for appliances by power range";
        System.out.println(consoleMenu);
    }

    private int readInput() {
        do {
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid input\n", input);
            }
        } while (!scanner.hasNextInt());

        return scanner.nextInt();
    }

    protected void proceedInput(List<ElectricAppliance> appliances) {
        printConsoleMenu();
        ApplianceUtil consumption = new ApplianceUtil();
        ApplianceUtil sort = new ApplianceUtil();
        ApplianceUtil search = new ApplianceUtil();

        switch (readInput()) {
            case (0):
                System.out.println("Have a nice day! Bye!");
                scanner.close();
                break;
            case (1):
                consumption.currentPowerConsumption(appliances);
                proceedInput(appliances);
                break;
            case (2):
                sort.sortAppliancesByPower(appliances);
                proceedInput(appliances);
                break;
            case (3):
                System.out.println("Please specify the value you want to start the search with");
                int fromWattage = scanner.nextInt();
                System.out.println("Up to what value are you looking for?");
                int upToWattage = scanner.nextInt();
                search.searchForApplianceByPowerRange(appliances, fromWattage, upToWattage);
                proceedInput(appliances);
                break;
            default:
                System.out.println("Sorry, I didn't catch that. Please, check your input value and try again");
                proceedInput(appliances);
        }
    }
}
