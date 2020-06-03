package by.epam.learn.task5.optional;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input your number");

        if (scanner.hasNextInt()) {
            Deque<Character> stack = new ArrayDeque<>();
            char[] chars = scanner.nextLine().toCharArray();
            for (char aChar : chars) {
                stack.push(aChar);
            }
            for (Character number : stack) {
                System.out.print(number);
            }
        } else {
            System.out.println("Wrong input");
        }
        scanner.close();
    }
}
