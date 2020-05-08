package by.epam.learn.main.tasks3_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputUtil {
    private static int startOfInterval;
    private static int endOfInterval;

    public static int getStartOfInterval() {
        return startOfInterval;
    }

    public void setStartOfInterval(int startOfInterval) {
        this.startOfInterval = startOfInterval;
    }

    public static int getEndOfInterval() {
        return endOfInterval;
    }

    public void setEndOfInterval(int endOfInterval) {
        this.endOfInterval = endOfInterval;
    }

    public static Map<String, Integer> input() {
        Map<String, Integer> input = new HashMap<String, Integer>();

        Scanner inputInterval = new Scanner(System.in);
        System.out.println("Please, enter the value from which the search will be start");
        startOfInterval = inputInterval.nextInt();
        System.out.println("Please, enter the value to which the search will be performed");
        endOfInterval = inputInterval.nextInt();

        input.put("Start", startOfInterval);
        input.put("End", endOfInterval);

        return input;
    }
}
