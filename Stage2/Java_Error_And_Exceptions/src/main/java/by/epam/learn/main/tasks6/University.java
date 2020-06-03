package by.epam.learn.main.tasks6;

import java.util.List;

public class University {
    private String name;
    static List<Faculty> faculties;

    public University(String name, List<Faculty> faculties) {
        this.name = name;
        University.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        University.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                '}';
    }
}
