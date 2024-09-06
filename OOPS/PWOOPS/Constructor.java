

class Student  {
    //instance variabel
    String name;
    int age;
    String address;
    int marks;
    String grade;

    // Constructor to initialize the fields
    public Student(String name, int age, String address, int marks, String grade) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
        this.grade = grade;
    }
    //Normal Method 
    // Method to display the details
    public void display() {  
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Constructor {

    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Prince", 18, "HELLO", 100, "A");
        student.display();
    }
}

