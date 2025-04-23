import java.util.Scanner;
public class MINIMUM 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE 1st AGE:-");
        int num1=sc.nextInt();
        System.out.print("ENTER THE 2nd AGE:-");
        int num2=sc.nextInt();
        System.out.print("ENTER THE 3rd AGE:-");
        int num3=sc.nextInt();
        if(num1<num2 && num1<num3)
        {
         System.out.printf("THE MINIMUM AGE IS %d:-",num1);
        }
        if(num2<num1 && num2<num3)
        {
         System.out.printf("THE MINIMUM AGE IS %d:-",num2);
        }
        if(num3<num1 && num3<num2)
        {
         System.out.printf("THE MINIMUM AGE IS %d:-",num3);  
        }
    }

}