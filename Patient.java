
public class Patient {
    public String name; // Name of patient
    public int age; // Age of patient
    public Patient beforeMe; // Reference to another patient
    public int number; // Unique number assigned to each patient
    private static int followingNumber = 1; // Class variable for the next patient's number

    // Constructor without predecessor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.number = followingNumber++;
    }

    // Constructor with predecessor
    public Patient(String name, int age, Patient predecessor) {
        this(name, age);
        this.beforeMe = predecessor;
    }

    // Instance method to check if the patient is the first in the waiting list
    public boolean isFirst() {
        return beforeMe == null;
    }

    // Instance method to provide a string representation of the patient
    public String toString() {
        String printText = name + " (" + number + ")";
        if (beforeMe != null) {
            printText += " comes after " + beforeMe.toString();
        }
        return printText;
    }

    // Class method to get the current followingNumber
    public static int getFollowingNumber() {
        return followingNumber;
    }

}
