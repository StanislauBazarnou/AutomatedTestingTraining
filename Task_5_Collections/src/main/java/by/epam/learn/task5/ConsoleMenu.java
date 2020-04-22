package by.epam.learn.task5;

import by.epam.learn.task5.model.ElectricAppliance;
import by.epam.learn.task5.util.ApplianceUtil;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

    void printConsoleMenu() {
        String consoleMenu = "Please, choose from the following options:" +
                "\n1. Calculate the current power consumption" +
                "\n2. Sort appliances by power" +
                "\n3. Search for appliances by power range";
        System.out.println(consoleMenu);
    }

    int inputtedNumberByUser() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        while (inputNumber < 1 || inputNumber > 3) {
            System.out.println("Please, check your input value and try again");
            inputNumber = scanner.nextInt();
        }
        return inputNumber;
    }

    void yesOrNo(List<ElectricAppliance> appliances) {
        System.out.println("\nWould you like to proceed? y/n");
        Scanner scanner = new Scanner(System.in);
        String yesOrNoInput = scanner.nextLine();
        if (yesOrNoInput.equalsIgnoreCase("Y")) {
            launchMethodBasedOnUserInput(appliances);
        } else if (yesOrNoInput.equalsIgnoreCase("N")) {
            System.out.println("Have a nice day! Bye!");
            scanner.close();
        } else {
            System.out.println("Sorry, I didn't catch that. Please answer y/n");
            yesOrNo(appliances);
        }
    }

    void launchMethodBasedOnUserInput(List<ElectricAppliance> appliances) {
        printConsoleMenu();
        switch (inputtedNumberByUser()) {
            case (1):
                ApplianceUtil.currentPowerConsumption(appliances);
                yesOrNo(appliances);
                break;
            case (2):
                ApplianceUtil.sortAppliancesByPower(appliances);
                yesOrNo(appliances);
                break;
            case (3):
                System.out.println("Please specify the value you want to start the search with");
                Scanner scanner = new Scanner(System.in);
                int fromWattage = scanner.nextInt();
                System.out.println("Up to what value are you looking for?");
                int upToWattage = scanner.nextInt();
                ApplianceUtil.searchForApplianceByPowerRange(appliances, fromWattage, upToWattage);
                yesOrNo(appliances);
                break;
        }
    }
}
