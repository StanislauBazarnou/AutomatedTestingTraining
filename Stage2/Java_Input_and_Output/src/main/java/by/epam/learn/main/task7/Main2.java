package by.epam.learn.main.task7;

import java.io.*;

public class Main {
    static File taskio = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input_" +
            "and_Output/data/TaskIO.txt");

    static void recursivePrint(File[] dir, Writer writer, int level) throws IOException {
        for (File file : dir) {
            for (int i = 0; i < level; i++) {
                writer.write("\t");
            }

            if (file.isFile()) {
                writer.write(file.getName() + "\n");
            }

            if (file.isDirectory()) {
                writer.write("[" + file.getName() + "]" + "\n");
                recursivePrint(file.listFiles(), writer, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        File directory = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input_and_Output");
        File[] dir = directory.listFiles();

        if (directory.exists() && directory.isDirectory()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(taskio))) {
                recursivePrint(dir, writer, 0);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
