import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args) 
    {
     int fact = 1,num;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     num=sc.nextInt();
     for(int i=1;i<=num;i++)
     {
        fact=fact*i;
     }
     System.out.printf("Factorial of %d is %d",num,fact);
    }
}
