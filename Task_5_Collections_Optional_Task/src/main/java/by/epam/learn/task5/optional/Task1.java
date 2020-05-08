package by.epam.learn.task5.optional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


//1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке
public class Task1 {

    private static final String BASE_PATH = "/home/stanislau/AutomatedTesting/AutomatedTestingTraining/" +
            "Task_5_Collections_Optional_Task/src/main/resources/";

    static Path filePath = Paths.get(BASE_PATH + "input.txt");
    static List<String> solarSystem = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        readFile();
        writeFile(solarSystem);
    }

    public static void readFile() {
        try {
            List<String> line = Files.readAllLines(filePath);
            solarSystem.addAll(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(List<String> solarSystem) throws IOException {
        Path newFile = Files.createFile(Paths.get(BASE_PATH + "output.txt"));
        List<String> reversedSolarSystem = new ArrayList<>();
        for (int i = solarSystem.size() - 1; i >= 0; i--) {
            reversedSolarSystem.add(solarSystem.get(i));
        }
        Files.write(newFile, reversedSolarSystem);
    }
}
