package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Task5_2 {

    static class Month {
        private int number;
        private int a;
        static boolean proceed;

        static ArrayList<String> months =  new ArrayList<>(Arrays.asList("January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December"));

        public void setNumber(int a) {
            if ( a < 1 || a > 13) {
                System.out.println("Please, make sure you entered correct number");
            } else {
                number = a;
                proceed = true;
            }
        }

        public int getNumber() {
            return number;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Task5.Month month = new Task5.Month();
        month.setNumber(Integer.parseInt(reader.readLine()));

        if (Task5.Month.proceed) {
            System.out.println(Month.months.get(month.getNumber()));
        }
    }
}
