package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> inputNumbers = new ArrayList<>();
        ArrayList<Long> numberOfDigits = new ArrayList<>();

        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            inputNumbers.add(input);
            numberOfDigits.add(input.chars().distinct().count());
        }

        int theSmallestIndex = numberOfDigits.indexOf(Collections.min(numberOfDigits));
        System.out.println(inputNumbers.get(theSmallestIndex));
    }
}
