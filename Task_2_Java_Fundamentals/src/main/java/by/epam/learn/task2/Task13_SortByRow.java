package by.epam.learn.main.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task13_SortByRow {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n =  Integer.parseInt(reader.readLine());

        List<List<Integer>> matrix = new ArrayList();
        for (int i = 0; i < 5; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                row.add(randomInt());
            }
            matrix.add(row);
        }

        Collections.sort(matrix.get(2)); // don't know how to sort one row, not all rows
        printArray(matrix); //just practicing in creating methods
    }

    static void printArray(List<List<Integer>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(matrix.get(i));
        }
    }

    static int randomInt() {
        int M = 10;
        int random = ThreadLocalRandom.current().nextInt(-M, M);
        return random;
    }
}





















