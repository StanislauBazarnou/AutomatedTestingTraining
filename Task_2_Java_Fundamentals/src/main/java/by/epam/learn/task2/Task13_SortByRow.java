package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task13_SortByRow {
    private int sizeOfMatrix;
    private int inputNumber;
    private int rowForSort;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Task13_SortByRow row = new Task13_SortByRow();
        System.out.println("Please enter the number that specify the size of the matrix");
        row.setSizeOfMatrix(parseInt(reader.readLine(), reader));
        System.out.println("Please specify the upper boundary of random number");
        row.setInputNumber(parseInt(reader.readLine(), reader));
        System.out.println("Please specify which row you wish to sort");
        row.setRowForSort(parseInt(reader.readLine(), reader));

        row.printingMatrix(row.sortingMatrix(row.fillMatrix()));
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
        Collections.sort(matrix.get(getRowForSort()));
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

    private int getRowForSort() {
        return rowForSort;
    }

    private void setRowForSort(int rowForSort) throws IOException {
        if (rowForSort < 0 || rowForSort >= getSizeOfMatrix()) {
            System.out.println("Number cannot be less than 0 and equal or greater than size of the matrix. " +
                    "Please check your input");
            rowForSort = parseInt(reader.readLine(), reader);
        }
        this.rowForSort = rowForSort;
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





















