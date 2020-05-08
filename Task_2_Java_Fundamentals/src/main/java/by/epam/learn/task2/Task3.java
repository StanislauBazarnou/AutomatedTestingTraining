package by.epam.learn.task2;

import java.util.concurrent.ThreadLocalRandom;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Task3 {
    private int arraySize;
    private int lowerBoundaryOfRandomNumbers;
    private int upperBoundaryOfRandomNumbers;

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.setArraySize(5);
        task3.setLowerBoundaryOfRandomNumbers(-10);
        task3.setUpperBoundaryOfRandomNumbers(10);

        int[] array = new int[task3.getArraySize()];
        for (int j = 0; j < array.length; ) {
            array[j] = task3.randomNumbers();
            System.out.println(array[j]);
            for (int i = 0; i < array.length; ) {
                array[i] = task3.randomNumbers();
                System.out.print(array[i] + " ");
                i++;
            }
            j++;
        }
    }

    private int randomNumbers() {
        return ThreadLocalRandom.current().nextInt(getLowerBoundaryOfRandomNumbers(), getUpperBoundaryOfRandomNumbers());
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int getLowerBoundaryOfRandomNumbers() {
        return lowerBoundaryOfRandomNumbers;
    }

    public void setLowerBoundaryOfRandomNumbers(int lowerBoundaryOfRandomNumbers) {
        this.lowerBoundaryOfRandomNumbers = lowerBoundaryOfRandomNumbers;
    }

    public int getUpperBoundaryOfRandomNumbers() {
        return upperBoundaryOfRandomNumbers;
    }

    public void setUpperBoundaryOfRandomNumbers(int upperBoundaryOfRandomNumbers) {
        this.upperBoundaryOfRandomNumbers = upperBoundaryOfRandomNumbers;
    }
}