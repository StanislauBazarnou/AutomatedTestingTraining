package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        String reversedString = "";
        for (int j = input.length - 1; j > -1; j--) {
            reversedString += String.valueOf(input[j]);
        }
        System.out.println(reversedString);
        reader.close();
    }
}
