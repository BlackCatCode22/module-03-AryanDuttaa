package Mystudent;

public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();
        myStudent.setFirstname("Aryan");
        myStudent.setLastname("Dutta");
        myStudent.setMajor("CIT");
        myStudent.setGpa(4.0);
        myStudent.setAge(19);
        myStudent.setOnProbation(false);
        myStudent.displayStudentInfo(); // Display the info of the first student

        System.out.println(); // Just to add a blank line between students

        Student myStudent2 = new Student();
        myStudent2.setFirstname("Jim");
        myStudent2.setLastname("Halpert");
        myStudent2.setMajor("Business");
        myStudent2.setGpa(2.3);
        myStudent2.setAge(24);
        myStudent2.setOnProbation(false);
        myStudent2.displayStudentInfo(); // Display the info of the second student
    }

    @Override
    public String toString() {
        return "App []";
    }
}
