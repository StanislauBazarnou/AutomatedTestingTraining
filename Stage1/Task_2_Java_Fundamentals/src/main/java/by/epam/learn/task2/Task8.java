package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также их длину
public class Task8 {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the numbers");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        fillListByInputNumbers(numbers, reader);
        calculateAverageLength(numbers);
        printNumbers(numbers);
    }

    private static void fillListByInputNumbers(List<Integer> numbers, BufferedReader reader) throws IOException {
        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            numbers.add(parseInt(input, reader));
        }
    }

    private static double calculateAverageLength(List<Integer> numbers) {
        double sumOfNumbersLength = 0.0;
        for (Integer number : numbers) {
            sumOfNumbersLength += String.valueOf(number).length();
        }
        return sumOfNumbersLength / numbers.size();
    }

    private static void printNumbers(List<Integer> numbers) {
        System.out.println("The average length of numbers is " + calculateAverageLength(numbers));
        for (Integer number : numbers) {
            if (String.valueOf(number).length() < calculateAverageLength(numbers)) {
                System.out.println("The number '" + number + "' has a shorter length than average length value. " +
                        "It's length is " + String.valueOf(number).length());
            }
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
}