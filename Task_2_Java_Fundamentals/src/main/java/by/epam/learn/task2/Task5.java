package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Task5 {

    static class Month {
        private int number;
        private int a;
        static boolean proceed;

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
        Month month = new Month();
        month.setNumber(Integer.parseInt(reader.readLine()));

        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        if (Month.proceed) {
            System.out.println(months.get(month.getNumber()));
        }
    }
}
