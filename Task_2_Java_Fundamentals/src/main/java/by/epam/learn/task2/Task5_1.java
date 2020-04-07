package by.epam.learn.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task5_1 {

    static class Month {
        private int number;
        private int a;
        static boolean proceed;
        private List<String> months ;

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

        static List<String> fillAndGetMonths() {
            List<String> months2 = new ArrayList<>();
            months2.add("January");
            months2.add("February");
            months2.add("March");
            months2.add("April");
            months2.add("May");
            months2.add("June");
            months2.add("July");
            months2.add("August");
            months2.add("September");
            months2.add("October");
            months2.add("November");
            months2.add("December");
            return months2;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Task5.Month month = new Task5.Month();
        month.setNumber(Integer.parseInt(reader.readLine()));

        if (Task5.Month.proceed) {
            System.out.println(Month.fillAndGetMonths().get(month.getNumber()));
        }
    }
}
