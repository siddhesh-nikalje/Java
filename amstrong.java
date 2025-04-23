import java.util.Scanner;
public class amstrong 
{ 
  public static void main(String[] args)
  {
    int sum =0,temp,num=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE NUMBER:-");
    num=sc.nextInt();
    temp=num;
    while(temp>0)
    {
     int digit = temp % 10;
     sum = sum+digit*digit*digit;
     temp = temp / 10;
    }
    if(num==sum)
    {
        System.out.println("AMSTRONG NUMBER");
    }
    else
    {
        System.out.println("NOT A AMSTRONG NUMBER");
    }
    }
}
