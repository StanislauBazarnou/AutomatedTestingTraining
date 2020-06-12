package by.epam.learn.main.task7optional;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//При разработке для вывода результатов создавать новую директорию и файл средствами класса File.
//9. Из текста Java-программы удалить все виды комментариев
public class Task9 {

    public static void main(String[] args) {
        File file = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input_and_Output" +
                "_Optional/src/main/java/by/epam/learn/main/task7optional/Task8.java");
        File resultingFile = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input" +
                "_and_Output_Optional/src/main/java/by/epam/learn/main/task7optional/txtfiles/Task9_Result.txt");

//        Pattern pattern = Pattern.compile();
//        Matcher matcher = pattern.matcher(line);

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(resultingFile))) {
            String line = reader.readLine();
            while (line != null) {
                String line2 = line.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
                System.out.println(line2);
                line = reader.readLine();
                }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error has occurred while reading a file");
        }
    }
}
