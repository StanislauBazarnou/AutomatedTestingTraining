package by.epam.learn.main.task3_2;

public abstract class Animal {
    int age;
    boolean hunger;
    String location;

    public void makeNoise() {
        System.out.println("Some noise");
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

}
