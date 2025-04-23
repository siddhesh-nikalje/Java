import java.util.*;
public class rectangle 
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle:-");
    int row = sc.nextInt();
    for(int i=1;i<=row;i++)
    {
        int n=2*i-1;
        for(int j=1;j<=row;j++)
        {
            System.out.print(n);
        }
        System.out.println();
        
    }
 }    
}
