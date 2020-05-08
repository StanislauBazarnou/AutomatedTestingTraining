package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Отобразить в окне консоли аргументы командной строки в обратном порядке
public class Task2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Type something");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        String reversedString = "";
        for (int i = input.length - 1; i > -1; i--) {
            reversedString += String.valueOf(input[i]);
        }
        System.out.println(reversedString);
        reader.close();
    }
}