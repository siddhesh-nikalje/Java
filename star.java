import java.util.*;
import java.io.*;

public class star 
{
    public static void main(String[] args) 
{
        
        int i,j;
        System.out.print("ENTER THE ROW:-");
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
        System.out.print("\n");

        }
    }
}
