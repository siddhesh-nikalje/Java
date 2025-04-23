import java.util.Scanner;

public class base 
{
    public static void main(String[] args) 
    {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power:- ");
        int power = sc.nextInt();
        System.out.println("Enter the Base:-");
        int base = sc.nextInt();
        
        int result = 1; 
        while (i <= power) 
        {
            result = result * base; 
            i++;
        }
        System.out.println("The result is:- " + result); 
    }
}
