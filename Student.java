package Mystudent;

public class Student {
    private String firstname;
    private String lastname;
    private String major;
    private double gpa;
    private int age;
    private boolean onProbation;

    // Constructor
    public Student() {
    }

    // Getters and Setters for each field
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOnProbation(boolean onProbation) {
        this.onProbation = onProbation;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Age: " + age);
        System.out.println("On Probation: " + onProbation);
    }
}
