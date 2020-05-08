package by.epam.learn.main.task3_2;

public class Dog extends Animal {
    String type;

    public void barking() {
        System.out.println("Gau - gau");
    }

    public Dog() {
    }

    public Dog(String type) {
        this.type = type;
    }


}
