package by.epam.learn.main.task7;

import java.io.*;
import java.util.Objects;

public class Main {
    static File taskio = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input_" +
            "and_Output/data/TaskIO.txt");

    static void recursivePrint(File[] dir, int level) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(taskio))) {
            for (File file : dir) {
                for (int i = 0; i < level; i++) {
                    writer.write("\t");
                }

                if (file.isFile()) {
                    writer.write(file.getName() + "\n");
                }

                if (file.isDirectory()) {
                    writer.write("[" + file.getName() + "]" + "\n");
                    recursivePrint(file.listFiles(), level + 1);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File directory = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input_and_Output");
        File[] dir = directory.listFiles();

        if (directory.exists() && directory.isDirectory()) {
            recursivePrint(dir, 0);
        }
    }
}
