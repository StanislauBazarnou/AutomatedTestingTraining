package by.epam.learn.task5.util;

import by.epam.learn.task5.model.ElectricAppliance;

import java.util.Comparator;
import java.util.List;

public class ApplianceUtil {

    public void currentPowerConsumption(List<ElectricAppliance> appliances) {
        int currentPowerConsumption = 0;
        for (ElectricAppliance appliance : appliances) {
            if (appliance.isOn()) {
                currentPowerConsumption += appliance.getWattage();
            }
        }
        System.out.println(currentPowerConsumption + " W is current consumption");
    }

    public void sortAppliancesByPower(List<ElectricAppliance> appliances) {
        appliances.stream()
                .sorted(Comparator.comparing(ElectricAppliance::getWattage))
                .map(i -> i.getName() + " with " + i.getWattage() + " W power consumption")
                .forEach(System.out::println);
    }

    public void searchForApplianceByPowerRange(List<ElectricAppliance> appliances, int fromWattage, int upToWattage) {
        appliances.stream()
                .filter(i -> (i.getWattage() >= fromWattage) && (i.getWattage() <= upToWattage))
                .forEach(s -> System.out.println(s.getName() + " with " + s.getWattage() + " W"));

        if (appliances.stream()
                .noneMatch(i -> (i.getWattage() >= fromWattage) && (i.getWattage() <= upToWattage))
        ) {
            System.out.println("No matches found");
        }
    }
}
