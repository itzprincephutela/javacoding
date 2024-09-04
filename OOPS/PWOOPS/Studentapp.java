
class Student {

    private int rollnumber;
    private String name;
    private String address;

    // Setter Methods
    public void setRollNumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter Methods
    public int getRollNumber() {
        return rollnumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class Studentapp {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Prince");
        s1.setRollNumber(12);
        s1.setAddress("abcdef");

        // Displaying the student information
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNumber());
        System.out.println("Address: " + s1.getAddress());
    }
}
