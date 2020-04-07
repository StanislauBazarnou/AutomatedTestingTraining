package by.epam.learn.task2;


import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[3];
        for (int j = 0; j < array.length;) {
            array[j] = random.nextInt(10);
            System.out.println(array[j]);
            for (int i = 0; i < array.length;) {
                array[i] = random.nextInt(10);
                System.out.print(array[i] + " ");
                i++;
            }
            j++;
        }
    }
}
