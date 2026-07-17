import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);
        System.out.println("Size: " + fruits.size());

        System.out.println("Reversed: " + fruits.reversed());
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);
    }
}
