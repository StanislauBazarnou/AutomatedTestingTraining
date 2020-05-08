package by.epam.learn.main.task3_2;

public class FrenchBulldog extends Dog {
    String name;
    int age;

    public FrenchBulldog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Very tasty");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void grunting() {
        System.out.println("I'm grunting very loud");
    }

    @Override
    public String toString() {
        return "FrenchBulldog{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                '}';
    }
}
