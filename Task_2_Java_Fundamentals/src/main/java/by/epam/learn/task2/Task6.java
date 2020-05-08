package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
public class Task6 {

    static List<Integer> numbers = new ArrayList<>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Please input numbers");
        input(reader, numbers);

        System.out.print("The longest number is " + findingMaxValue(numbers) + ", it's length is "
                + String.valueOf(findingMaxValue(numbers)).length() + ". " +
                "The shortest numbers is " + findingMinValue(numbers) +
                ", it's length is " + String.valueOf(findingMinValue(numbers)).length());
    }

    private static void input(BufferedReader reader, List<Integer> numbers) throws IOException {
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            numbers.add(Math.abs(parseInt(s, reader)));
        }
    }

    private static int parseInt(String input, BufferedReader reader) throws IOException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please check your input");
            return parseInt(reader.readLine(), reader);
        }
    }

    private static int findingMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .orElse(0);
    }

    private static int findingMinValue(List<Integer> numbers) {
        return numbers.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .orElse(0);
    }
}