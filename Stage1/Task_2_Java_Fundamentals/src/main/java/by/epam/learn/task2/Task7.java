package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Вывести числа в порядке возрастания (убывания) значений их длины
public class Task7 {

    public static void main(String[] args) throws IOException {
        System.out.println("Please input numbers");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            numbers.add(parseInt(input, reader));
        }

        Collections.sort(numbers);
//        Collections.reverse(numbers);
        printArray(numbers);
    }

    public static int parseInt(String input, BufferedReader reader) throws IOException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please check your input");
            return parseInt(reader.readLine(), reader);
        }
    }

    public static void printArray(List<Integer> integerNumber) {
        for (Integer number : integerNumber) {
            System.out.println(number);
        }
        System.out.println("");
    }
}