package by.epam.learn.task5.optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

//Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец,
// а положительные — в начало списка
public class Task5 {

    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        int numbersAmount = 20;
        fillArrayWithRandomNumbers(numbers, numbersAmount);
        printArray(sort(numbers));
//        printArray(bubbleSort(numbers));
    }

    private static int randomInt() {
        int random = ThreadLocalRandom.current().nextInt(-10, 10);
        return random;
    }

    private static void fillArrayWithRandomNumbers(List<Integer> numbers, int numbersAmount) {
        for (int i = 0; i < numbersAmount; i++) {
            numbers.add(randomInt());
        }
    }

    private static List<Integer> sort(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    private static List<Integer> bubbleSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) < numbers.get(j + 1)) {
                    int swap = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, swap);
                }
            }
        }
        return numbers;
    }

    private static void printArray(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
