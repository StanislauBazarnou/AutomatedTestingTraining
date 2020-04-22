package appliances;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

    static void printConsoleMenu() {
        String[] consoleMenu = {
                "Please, choose from the following options:",
                "1. Calculate the current power consumption",
                "2. Sort appliances by power",
                "3. Search for appliances by power range"
        };
        for (String console : consoleMenu) {
            System.out.println(console);
        }
    }

    static int inputtedNumberByUser() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        while (inputNumber < 1 || inputNumber > 3) {
            System.out.println("Please, check your input value and try again");
            inputNumber = scanner.nextInt();
        }
        return inputNumber;
    }

    static void yesOrNo(List<ElectricAppliance> appliances) {
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

    static void launchMethodBasedOnUserInput(List<ElectricAppliance> appliances) {
        printConsoleMenu();
        Scanner scanner = new Scanner(System.in);
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
                int fromWattage = scanner.nextInt();
                System.out.println("Up to what value are you looking for?");
                int upToWattage = scanner.nextInt();
                ApplianceUtil.searchForApplianceByPowerRange(appliances, fromWattage, upToWattage);
                yesOrNo(appliances);
                break;
        }
    }
}
