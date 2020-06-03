package by.epam.learn.main.task7;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        for(String element : args) {
            System.out.println("Element " + i++ + " is " + element);
        }
    }
}
