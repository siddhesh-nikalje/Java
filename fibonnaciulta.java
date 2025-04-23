import java.util.Scanner;
public class fibonnaciulta 
{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n1=0,n2=1,temp;
 System.out.print("ENTER THE NUMBER:-");
 int n=sc.nextInt();
 int i=0;
 for (i = 0; i < n; i++) {
    System.out.print(n1 + " ");
    temp = n1 + n2;
    n1 = n2;        
    n2 = temp;      
}
}
}