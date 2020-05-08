package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале
// значений от -M до M с помощью генератора случайных чисел (класс Random).
//1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки)
public class Task13_SortByColumn {
    private int sizeOfMatrix;
    private int inputNumber;
    private int columnForSort;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Task13_SortByColumn task13 = new Task13_SortByColumn();
        System.out.println("Please enter the number that specify the size of the matrix");
        task13.setSizeOfMatrix(parseInt(reader.readLine(), reader));
        System.out.println("Please specify the upper boundary of random number");
        task13.setInputNumber(parseInt(reader.readLine(), reader));
        System.out.println("Please specify which column you wish to sort");
        task13.setColumnForSort(parseInt(reader.readLine(), reader));

        task13.printingMatrix(task13.sortingMatrix(task13.fillMatrix()));
    }

    private List<List<Integer>> fillMatrix() {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < getSizeOfMatrix(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < getSizeOfMatrix(); j++) {
                int randomNumber = ThreadLocalRandom.current().nextInt(-getInputNumber(), getInputNumber());
                row.add(randomNumber);
            }
            matrix.add(row);
        }
        return matrix;
    }

    private List<List<Integer>> sortingMatrix(List<List<Integer>> matrix) {
        matrix.sort(Comparator.comparing(column -> column.get(getColumnForSort())));
        return matrix;
    }

    private void printingMatrix(List<List<Integer>> matrix) {
        matrix.forEach(System.out::println);
    }

    private int getSizeOfMatrix() {
        return sizeOfMatrix;
    }

    private void setSizeOfMatrix(int sizeOfMatrix) throws IOException {
        while (sizeOfMatrix < 1) {
            System.out.println("Size of matrix cannot be less that 1. Please check your input");
            sizeOfMatrix = parseInt(reader.readLine(), reader);
        }
        this.sizeOfMatrix = sizeOfMatrix;
    }

    private int getInputNumber() {
        return inputNumber;
    }

    private void setInputNumber(int inputNumber) throws IOException {
        while (inputNumber < 1) {
            System.out.println("Number cannot be less that 1. Please check your input");
            inputNumber = parseInt(reader.readLine(), reader);
        }
        this.inputNumber = inputNumber;
    }

    private int getColumnForSort() {
        return columnForSort;
    }

    private void setColumnForSort(int columnForSort) throws IOException {
        if (columnForSort < 0 || columnForSort >= getSizeOfMatrix()) {
            System.out.println("Number cannot be less than 0 and equal or greater than size of the matrix. " +
                    "Please check your input");
            columnForSort = parseInt(reader.readLine(), reader);
        }
        this.columnForSort = columnForSort;
    }

    private static int parseInt(String input, BufferedReader reader) throws IOException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please check your input");
            return parseInt(reader.readLine(), reader);
        }
    }
}