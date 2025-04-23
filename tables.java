import java.util.*;
public class tables
{
    public static void main(String[] args) 
    {
    int i;  
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number:- ");
     int num=sc.nextInt();
    for(i=1;i<=10;i++)
    {
        System.out.println(i*num);
    }
    }
}