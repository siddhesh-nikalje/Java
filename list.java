import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);

        System.out.println("Element at index 0: " + list.get(0));

        list.remove(0);

        // Print the updated List
        System.out.println("Updated List: " + list);
    }
}
