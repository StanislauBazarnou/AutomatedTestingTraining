package by.epam.learn.main.task3_2;

public class Patient {
    int id;
    String surname;
    String name;
    String middleName;
    String address;
    long telephoneNumber;
    long medicalCardNumber;
    String diagnosis;

    public Patient(int id, String surname, String name, String address, long telephoneNumber, long medicalCardNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String surname, String name, String middleName, String address, long telephoneNumber, long medicalCardNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(long medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
