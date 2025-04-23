import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        int i,isPrime=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:-");
        int num=sc.nextInt();
    
    if(num<=1)
    {
        System.out.print("IS NOT A PRIME NUMBER");
    }
    else
    {
        for(i=num;num<=1;num++)
        {
         if(num%i==0)
         {
            isPrime=0;
            System.out.print("IS NOT A PRIME NUMBER");
            break;
         }
                
        }
    
    }
    if(isPrime==1)
    {
        System.out.print("IS A PRIME NUMBER");
    }
}
}
