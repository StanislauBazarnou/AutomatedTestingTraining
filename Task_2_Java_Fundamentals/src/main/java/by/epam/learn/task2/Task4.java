package by.epam.learn.task2;

import java.util.Scanner;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль
public class Task4 {

    public static void main(String[] args) {
        System.out.println("Please input numbers");
        Scanner scanner = new Scanner(System.in);
        int multiplication = 1;

        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            multiplication *= parseInt(s, scanner);
        }
        System.out.println("The result of your multiplication is " + multiplication);
        scanner.close();
    }

    private static int parseInt(String input, Scanner scanner) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please check your input");
            return parseInt(scanner.nextLine(), scanner);
        }
    }
}