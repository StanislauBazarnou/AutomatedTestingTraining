package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> numbers = new ArrayList();

        while(true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            numbers.add(s);
        }
        int max = numbers.get(0).length();
        int min = numbers.get(0).length();
        String maximum = "";
        String minimum = "";

        for (int i = 0; i < numbers.size(); i++) {
            if (max <= numbers.get(i).length()) {
                max = numbers.get(i).length();
                maximum = numbers.get(i);
            }
            if (min >= numbers.get(i).length()) {
                min = numbers.get(i).length();
                minimum = numbers.get(i);
            }

        }
        System.out.print("Самое длинное число " + maximum + ", его длина " + max + ".  " + "Самое короткое число " + minimum + ", его длина " + min);
    }
}
