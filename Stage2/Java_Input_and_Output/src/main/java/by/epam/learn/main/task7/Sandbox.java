package by.epam.learn.main.task7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandbox {
    static File taskio = new File("/home/stanislau/AutomatedTesting/AutomatedTestingTraining/Stage2/Java_Input_" +
            "and_Output/data/TaskIO.txt");

    static void recursivePrint(File[] dir, int level) {
        for (File file : dir) {
            for (int i = 0; i < level; i++) {
                System.out.print(("\t"));
            }

            if (file.isFile()) {
                System.out.println((file.getName()));
            }

            if (file.isDirectory()) {
                System.out.println(("[" + file.getName() + "]"));
                recursivePrint(file.listFiles(), level + 1);
            }
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
