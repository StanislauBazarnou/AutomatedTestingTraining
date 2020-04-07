package Task_3_Java_Classes.src.main.java.by.epam.learn.main.task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Ivanov", "Ivan", "Ivanovich",
                LocalDate.of(1991, 2, 27), "Minsk, pr. Nezavisimosti", "375291234567", "Economy",
                3, "805Ec");
        Student student2 = new Student(2, "Ivanova", "Ivana", "Ivanovicha",
                LocalDate.of(1998, 3, 17), "Minsk, pr. Nezavisimosti", "375291234576", "Economy",
                2, "805Ec");
        Student student3 = new Student(3, "Ivanman", "Iva", LocalDate.of(1996, 12, 30), "Minsk, pr. Nezavisimosti", "375291234567", "Economy",
                3, "805Ec");
        Student student4 = new Student(4, "Reagan", "Ronald", LocalDate.of(1996, 7, 16), "Minsk, pr. Nezavisimosti", "375299134567", "Political Science",
                4, "712Ps");
        Student student5 = new Student(5, "Bush", "George", LocalDate.of(1996, 7, 12), "Minsk, pr. Nezavisimosti", "375711234567", "Political Science",
                5, "712Ps");
        Student student6 = new Student(6, "Obama", "Barack", LocalDate.of(1997, 10, 13), "Minsk, pr. Nezavisimosti", "375291864567", "Political Science",
                3, "712Ps");
        Student student7 = new Student(7, "Trump", "Donald", LocalDate.of(1996, 11, 7), "Minsk, pr. Nezavisimosti", "375238234567", "Political Science",
                2, "712Ps");
        Student student8 = new Student(8, "Smith", "John", LocalDate.of(1997, 7, 25), "Minsk, pr. Nezavisimosti", "375291234519", "Political Science",
                4, "712Ps");
        Student student9 = new Student(9, "Hleb", "Alexander", "Paulavich",
                LocalDate.of(1994, 03, 19), "Minsk, pr. Nezavisimosti", "375297854576", "Faculty of Sports",
                5, "905Fs");
        Student student10 = new Student(10, "Bykov", "Alexander", "Gennadievich",
                LocalDate.of(1998, 3, 8), "Minsk, pr. Nezavisimosti", "379527854576", "Faculty of Sports",
                2, "905Fs");

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

//        StudentUtil.print("Faculty of Sports", students);
//        StudentUtil.print("Economy", 3, students);
        StudentUtil.printBirthday(LocalDate.of(1998, 2, 15), students);
//        StudentUtil.printGroup("805Ec", students);


    }
}