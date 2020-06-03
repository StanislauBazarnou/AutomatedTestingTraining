package by.epam.learn.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел
public class Task5 {

    static Scanner scanner = new Scanner(System.in);
    int inputNumber;
    static boolean proceed;

    private static int parseInt(String input, Scanner scanner) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please check your input");
            return parseInt(scanner.nextLine(), scanner);
        }
    }

    private void setInputNumber(int inputNumber) {
        while (inputNumber < 1 || inputNumber > 12) {
            System.out.println("Please make sure you entered correct number");
            inputNumber = parseInt(scanner.nextLine(), scanner);
        }
        this.inputNumber = inputNumber - 1;
        proceed = true;
    }

    private int getInputNumber() {
        return inputNumber;
    }

    public static void main(String[] args) {
        System.out.println("Please input the number corresponding to the month (from 1 to 12)");
        Task5 task = new Task5();
        task.setInputNumber(parseInt(scanner.nextLine(), scanner));

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

        if (proceed) {
            System.out.println("The month you have chosen is " + months.get(task.getInputNumber()));
        }
    }
}