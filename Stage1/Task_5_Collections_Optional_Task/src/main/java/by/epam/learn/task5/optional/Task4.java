package by.epam.learn.task5.optional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Занести стихотворение в список. Провести сортировку по возрастанию длин строк
public class Task4 {
    static List<String> poemLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        readPoem();
        poemLines.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(p -> System.out.println(p + " (" + p.length() + " symbols)"));
    }

    static void readPoem() {
        try {
            poemLines = Files.readAllLines(Paths.get("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/" +
                    "Task_5_Collections_Optional_Task/src/main/resources/poem.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
