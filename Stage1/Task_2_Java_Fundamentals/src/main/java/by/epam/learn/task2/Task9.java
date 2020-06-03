package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них
public class Task9 {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the numbers");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputNumbers = new ArrayList<>();
        List<Integer> numberOfDigits = new ArrayList<>();

        fillListByInputNumbers(inputNumbers, reader);
        countDifferentDigits(numberOfDigits, inputNumbers);
        print(inputNumbers, numberOfDigits);
    }

    private static void fillListByInputNumbers(List<Integer> inputNumbers, BufferedReader reader) throws IOException {
        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            inputNumbers.add(parseInt(input, reader));
        }
    }

    private static void countDifferentDigits(List<Integer> numberOfDigits, List<Integer> inputNumbers) {
        for (Integer number : inputNumbers) {
            numberOfDigits.add((int) String.valueOf(number).chars().distinct().count());
        }
    }

    private static void print(List<Integer> inputNumbers, List<Integer> numberOfDigits) {
        int theIndexOfSmallestNumber = numberOfDigits.indexOf(Collections.min(numberOfDigits));
        System.out.println("The first number with the minimum amount of different digits is " +
                inputNumbers.get(theIndexOfSmallestNumber));
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