package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 1;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            b *= a;
        }
        System.out.println(b);
    }
}
