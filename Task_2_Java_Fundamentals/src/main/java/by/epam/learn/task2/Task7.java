package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList();

        while(true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            numbers.add(Integer.parseInt(s));
        }

        Collections.sort(numbers);
        printArray(numbers);
        Collections.reverse(numbers);
        printArray(numbers);
    }

    public static void printArray(List<Integer> integerNumber) {
        for (Integer s : integerNumber) {
            System.out.println(s);
        }
        System.out.println("");
    }
}