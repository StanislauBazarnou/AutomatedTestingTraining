package by.epam.learn.task5.optional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Создать список из элементов каталога и его подкаталогов
public class Task3 {

    public static void main(String[] args) {
        HashMap<String, List<String>> catalog = new HashMap<>();

        List<String> model = new ArrayList<>();
        model.add("CeilingLamp");
        model.add("DeskLamp");
        model.add("ElectronicAppliance");
        model.add("Laptop");
        model.add("Microwave");

        List<String> util = new ArrayList<>();
        util.add("ConsolMenu");
        util.add("Main");

        catalog.put("Model", model);
        catalog.put("Util", util);

        System.out.println(catalog.get("Util"));
    }
}
