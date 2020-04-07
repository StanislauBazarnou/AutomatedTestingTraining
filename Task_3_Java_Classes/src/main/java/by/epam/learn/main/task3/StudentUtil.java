package Task_3_Java_Classes.src.main.java.by.epam.learn.main.task3;

import java.time.LocalDate;

public class StudentUtil {

private StudentUtil(){}

    public static void print(String faculty, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i]);
            }
        }
    }
    public static void print (String faculty, int course, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course) {
                System.out.println(students[i]);
            }
        }
    }
    public static void printBirthday (LocalDate birthday, Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getBirthday().isAfter(birthday)) {
                System.out.println(students[i]);
            }
        }
    }

    public static void printGroup (String group, Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals(group)) {
                System.out.println(students[i]);
            }
        }
    }
}
