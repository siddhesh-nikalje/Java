import java.util.Scanner;

public class FiveStar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


                System.out.print("Enter an Alphabet: ");
                char alpha = input.next().charAt(0); // Read the first character of the input

                // Method 1: Using OR conditions (Similar to C code)
                if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
                        alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
                    System.out.println(alpha + " is a Vowel");
                } else {
                    System.out.println(alpha + " is a Consonant");
                }

                // Method 2: Using a String and contains() (More concise)
                String vowels = "aeiouAEIOU";
                if (vowels.contains(String.valueOf(alpha))) { // Convert char to String
                    System.out.println(alpha + " is a Vowel");
                } else {
                    System.out.println(alpha + " is a Consonant");
                }

                // Method 3: Using a switch statement (Good for multiple discrete values)
                switch (alpha) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(alpha + " is a Vowel");
                        break;
                    default:
                        System.out.println(alpha + " is a Consonant");
                }

                // Method 4: Using toLowerCase() or toUpperCase() (Simplifies comparison)
                char lowerAlpha = Character.toLowerCase(alpha); // convert to lowercase for comparison
                if (lowerAlpha == 'a' || lowerAlpha == 'e' || lowerAlpha == 'i' || lowerAlpha == 'o' || lowerAlpha == 'u') {
                    System.out.println(alpha + " is a Vowel");
                } else {
                    System.out.println(alpha + " is a Consonant");
                }

                input.close(); // Important: Close the scanner to prevent resource leaks

    }
}
