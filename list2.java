import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list2 {
    public static void main(String[] args) {
        // Example 1: Looping in a List using while loop
        List<String> animalsWhile = new ArrayList<>();
        animalsWhile.add("Zebra");
        animalsWhile.add("Tiger");
        animalsWhile.add("Lion");
        animalsWhile.add("Jackal");
        animalsWhile.add("Kangaroo");

        System.out.println("Example 1 (while loop):");
        int i = 0;
        while (i < animalsWhile.size()) {
            System.out.println(animalsWhile.get(i));
            i++;
        }
        System.out.println();

        // Example 2: Looping in a List using for-each loop
        List<String> animalsFor = new ArrayList<>();
        animalsFor.add("Zebra");
        animalsFor.add("Tiger");
        animalsFor.add("Lion");
        animalsFor.add("Jackal");
        animalsFor.add("Kangaroo");

        System.out.println("Example 2 (for-each loop):");
        for (String animal : animalsFor) {
            System.out.println(animal);
        }
        System.out.println();

        // Example 3: Iterating through a list using for loop with index
        List<String> animalsIndexed = new ArrayList<>();
        animalsIndexed.add("Zebra");
        animalsIndexed.add("Tiger");
        animalsIndexed.add("Lion");
        animalsIndexed.add("Jackal");
        animalsIndexed.add("Kangaroo");

        System.out.println("Example 3 (for loop with index):");
        for (int index = 0; index < animalsIndexed.size(); index++) {
            System.out.println(index + " " + animalsIndexed.get(index));
        }
        System.out.println();

        // Taking list elements from the user - Example 1
        List<Integer> arr1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Example 1 (Taking list elements from user):");
        for (int j = 0; j < 5; j++) {
            System.out.print("Enter the " + (j + 1) + " Element: ");
            int element = scanner.nextInt();
            arr1.add(element);
        }

        System.out.println("\n");
        for (int j = 0; j < 5; j++) {
            System.out.println("Element on " + j + " Index is: " + arr1.get(j));
        }
        System.out.println();

        // Taking list elements from the user - Example 2
        System.out.println("Example 2 (Taking list elements from user with size input):");
        System.out.print("Enter the Size of Array: ");
        int size = scanner.nextInt();

        if (size > 0) {
            List<Integer> arr2 = new ArrayList<>();
            for (int k = 0; k < size; k++) {
                System.out.print("Enter the " + (k + 1) + " Element: ");
                int element = scanner.nextInt();
                arr2.add(element);
            }

            System.out.println("\n");
            for (int k = 0; k < size; k++) {
                System.out.println("Element on " + k + " Index is: " + arr2.get(k));
            }
        }

        scanner.close();
    }
}

