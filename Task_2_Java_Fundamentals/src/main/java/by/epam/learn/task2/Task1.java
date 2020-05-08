package by.epam.learn.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Приветствовать любого пользователя при вводе его имени через командную строку
public class Task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type your name please");
        String name = reader.readLine();
        System.out.println("Hello dear, " + name);
    }
}