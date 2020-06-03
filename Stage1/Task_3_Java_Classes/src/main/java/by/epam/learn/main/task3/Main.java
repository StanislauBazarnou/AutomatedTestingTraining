package by.epam.learn.main.task3;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        Student student1 = new Student(1, "Keynes", "John", "Maynard",
                LocalDate.of(1883, 6, 5), "Minsk, Independence Avenue ",
                "Faculty of Economics", 3, "805Ec");
        Student student2 = new Student(2, "Smith", "Adam", LocalDate.of(1723, 6, 16),
                "Minsk, Independence Avenue ", "Faculty of Economics", 2, "805Ec");
        Student student3 = new Student(3, "Rand", "Ayn", LocalDate.of(1905, 2, 2),
                "Minsk, Independence Avenue ", "Faculty of Economics", 3, "805Ec");
        Student student4 = new Student(4, "Reagan", "Ronald", LocalDate.of(1911, 2, 6),
                "Minsk, Independence Avenue ", "Political Science", 4, "712Ps");
        Student student5 = new Student(5, "Bush", "George", LocalDate.of(1924, 6, 12),
                "Minsk, Independence Avenue ", "Political Science", 5, "712Ps");
        Student student6 = new Student(6, "Obama", "Barack", LocalDate.of(1961, 8, 4),
                "Minsk, Independence Avenue ", "1334164567", "Political Science",
                3, "712Ps");
        Student student7 = new Student(7, "Trump", "Donald", LocalDate.of(1946, 6, 14),
                "Minsk, Independence Avenue ", "13368234567", "Political Science",
                2, "712Ps");
        Student student8 = new Student(8, "Einstein", "Albert", LocalDate.of(1879, 3, 14),
                "Minsk, Independence Avenue ", "Faculty of Physics", 4, "712Phf");
        Student student9 = new Student(9, "Hleb", "Alexander", "Paulavich",
                LocalDate.of(1981, 5, 1), "Minsk, Independence Avenue", "375297854576", "Faculty of Sports",
                5, "905Fs");
        Student student10 = new Student(10, "Domracheva", "Darya", "Vladímirovna",
                LocalDate.of(1986, 8, 3), "Minsk, Independence Avenue ",
                "379527854576", "Faculty of Sports", 2, "905Fs");

        Student[] students = new Student[10];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        students[9] = student10;

        String facultyOfSport = "Faculty of Sports";
        System.out.printf("Sort by %s \n", facultyOfSport);
        StudentUtil.printFaculty("Faculty of Sports", students);

        String facultyOfEconomy = "Faculty of Economics";
        String course = "Course";
        System.out.printf("\nSort by %s and %s \n", facultyOfEconomy, course);
        StudentUtil.printFacultyAndCourse("Faculty of Economics", 3, students);

        System.out.println("\nSort by birthday");
        StudentUtil.printBirthday(LocalDate.of(1942, 2, 15), students);

        String groupNumber = "805Ec";
        System.out.printf("\nSort by group number %s \n", groupNumber);
        StudentUtil.printGroup("805Ec", students);
    }
}