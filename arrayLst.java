import java.util.ArrayList;

public class arrayLst {

    // Constructor to initialize and populate the ArrayList
    public arrayLst() {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Display the elements of the ArrayList
        System.out.println("ArrayList: " + list);
    }

    public static void main(String[] args) {
        // Create an instance of the class to execute the constructor
        new arrayLst();
    }
}
