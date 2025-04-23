
import java.util.*;

public class project
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Alphabet: ");
        char alpha = sc.next().charAt(0); 
         // Method 3: Using a switch statement (Good for multiple discrete values)
        switch (alpha) 
        {
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
    }
}