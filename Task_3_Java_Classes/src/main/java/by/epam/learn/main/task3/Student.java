package Task_3_Java_Classes.src.main.java.by.epam.learn.main.task3;

import java.time.LocalDate;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private LocalDate birthday;
    private String address;
    private String telephoneNumber;
    private String faculty;
    private int course;
    private String group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    Student(int id, String surname, String name, String middleName, LocalDate birthday, String address, String telephoneNumber,
            String faculty, int course, String group) {
        this.setId(id);
        this.setSurname(surname);
        this.setName(name);
        this.setMiddleName(middleName);
        this.setBirthday(birthday);
        this.setAddress(address);
        this.setTelephoneNumber(telephoneNumber);
        this.setFaculty(faculty);
        this.setCourse(course);
        this.setGroup(group);
    }

    Student(int id, String surname, String name, LocalDate birthday, String address, String telephoneNumber,
            String faculty, int course, String group) {
        this.setId(id);
        this.setSurname(surname);
        this.setName(name);
        this.setBirthday(birthday);
        this.setAddress(address);
        this.setTelephoneNumber(telephoneNumber);
        this.setFaculty(faculty);
        this.setCourse(course);
        this.setGroup(group);
    }


}