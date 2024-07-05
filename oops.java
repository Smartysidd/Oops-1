
class Student {
    String name;
    int age;

    // Method to print student information
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Default constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

class Studentas {
    String name;
    int age;

    // Method to print student information
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Default constructor
    Studentas() {
    }

    // Parameterized constructor
    Studentas(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor to initialize from another Student object
    Studentas(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class oops {
    public static void main(String[] args) {
        // Using the default constructor
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;

        // Using the parameterized constructor
        Student s3 = new Student("Rohan", 22);

        // Using the copy constructor
        Student s2 = new Student(s1);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        // Using the parameterized constructor for Studentas
        Studentas s4 = new Studentas("Siddharth", 23);
        s4.printInfo();
    }
}
