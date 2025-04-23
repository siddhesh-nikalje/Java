import java.util.*;
public class star2
{
 public static void main(String[] args) 
 {  
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE NUMBER OF ROWS:-");
    int rows=sc.nextInt();
    for(i=1;i<=rows;i++)
    {
        for(j=1;j<=rows-i;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(j+" ");
            
        }
        System.out.println();
    }
 }   
}
