import java.util.ArrayList;

public class Dynamicarray {

    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Adding elements to the ArrayList
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        // Displaying elements in the ArrayList
        System.out.println("Elements in the ArrayList: " + numbersList);

        // Accessing elements by index
        System.out.println("Element at index 2: " + numbersList.get(2));

        // Updating an element at a specific index
        numbersList.set(1, 25);
        System.out.println("Updated ArrayList: " + numbersList);

        // Removing an element by value
        numbersList.remove(Integer.valueOf(30));
        System.out.println("ArrayList after removing 30: " + numbersList);

        // Checking if the ArrayList contains a specific element
        if (numbersList.contains(40)) {
            System.out.println("ArrayList contains 40");
        } else {
            System.out.println("ArrayList does not contain 40");
        }

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbersList.size());

        // Iterating through the ArrayList using a for-each loop
        System.out.print("Elements in the ArrayList (using for-each loop): ");
        for (Integer num : numbersList) {
            System.out.print(num + " ");
        }
    }
}
