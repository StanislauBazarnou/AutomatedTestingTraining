package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the numbers in the list: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> numbers = new ArrayList<>();
        double sum = 0.0;
        double average = 0.0;

        while (true) {
        String s = reader.readLine();
            if (s.isEmpty()) break;
            numbers.add(s);
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i).length();
        }

        average = sum/numbers.size();
        System.out.println("Average length is " + average);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).length() < average) {
                System.out.println("The number '" + numbers.get(i) + "' has a shorter length than average value. It's length is " + numbers.get(i).length());
            }
        }
    }
}
