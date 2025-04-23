import java.util.Scanner;
public class Donation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter the weight:- ");
        int num2 = sc.nextInt();
        if(num1>=18 && num2>=50)
        {
            System.out.println("You are eligible for donation");
        }
        if(num1>=18 && num2<50)
        {
            System.out.print("Your weight doesnt meet the criteria for donation");
        }
        if(num1<=18 && num2>=50)
        {
            System.out.print("Your age doesnt meet the criteria for donation");
        }
        if(num1<=0 || num2<=0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("You are not eligible for donation");
        }
    }
}
