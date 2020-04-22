package appliances;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ElectricAppliance> appliances = new ArrayList<>();
        appliances.add(new ElectricAppliance("Sony VGN-240E", 76, true));
        appliances.add(new ElectricAppliance("Lenovo G700", 65, true));
        appliances.add(new ElectricAppliance("Lenovo G50", 45, false));
        appliances.add(new ElectricAppliance("Desk lamp", 100, true));
        appliances.add(new ElectricAppliance("Ceiling lamp", 50, false));
        appliances.add(new ElectricAppliance("Microwave", 900, false));
        appliances.add(new ElectricAppliance("TV set", 45, true));
        appliances.add(new ElectricAppliance("Iron", 3000, false));

        ConsoleMenu.launchMethodBasedOnUserInput(appliances);
    }
}
