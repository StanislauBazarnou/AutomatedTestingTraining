package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        while(true) {
            String readedLine = reader.readLine();
            if (readedLine.isEmpty()) break;
            int number = Integer.parseInt(readedLine);
            numbers.add(number);
        }

        int max = Collections.max(numbers); // примитивный тип, к которому джава приводит автоматически
        Integer min = Collections.min(numbers); // объект

        System.out.println(max + " " + numbers.indexOf(max));
        System.out.println(min + " " + numbers.indexOf(min));




    }
}
