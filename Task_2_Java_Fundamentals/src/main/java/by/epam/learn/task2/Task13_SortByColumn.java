package by.epam.learn.main.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task13_SortByColumn {
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

          sort(matrix); //just practicing in creating methods
          print(matrix);
    }

        static void sort(List<List<Integer>> matrix) {
            Collections.sort(matrix, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> row, List<Integer> nextRow) { //row - это строка
                    return row.get(0).compareTo(nextRow.get(0));
                }
            });
        }

        static void print(List<List<Integer>> twoArrayLists) {
            for(int i = 0; i < twoArrayLists.size(); i++){
                System.out.println(twoArrayLists.get(i));
            }
        }

    static int randomInt() {
        int M = 10;
        int random = ThreadLocalRandom.current().nextInt(-M, M);
        return random;
    }
}

