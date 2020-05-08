package by.epam.learn.main.task3;

import java.time.LocalDate;

public class StudentUtil {

    public static void printFaculty(String faculty, Student[] students) {
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
    }

    public static void printFacultyAndCourse(String faculty, int course, Student[] students) {
        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void printBirthday(LocalDate birthday, Student[] students) {
        for (Student student : students) {
            if (student.getBirthday().isAfter(birthday)) {
                System.out.println(student);
            }
        }
    }

    public static void printGroup(String group, Student[] students) {
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
    }
}
