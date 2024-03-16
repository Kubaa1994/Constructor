
public class TestPatient {
    public static void main(String[] args) {
        Patient smith = new Patient("R. Smith", 69);
        System.out.println(smith);
        System.out.println("Number: " + smith.number + ", Following Number: " + Patient.getFollowingNumber());
        System.out.println("Is First: " + smith.isFirst());
        System.out.println();

        Patient jones = new Patient("G. Jones", 45, smith);
        System.out.println(jones);
        System.out.println("Number: " + jones.number + ", Following Number: " + Patient.getFollowingNumber());
        System.out.println("Is First: " + jones.isFirst());
        System.out.println();

        Patient williams = new Patient("J. Williams", 29, jones);

        // Display patient information and the state of number and followingNumber

        System.out.println(williams);
        System.out.println("Number: " + williams.number + ", Following Number: " + Patient.getFollowingNumber());
        System.out.println("Is First: " + williams.isFirst());
    }
}
