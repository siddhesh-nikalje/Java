import java.util.*;
public class don 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
       
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            System.out.printf("ENTER THE %d TO STORE:-",+i);
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER THE NUMBER YOU WANT TO SEARCH:-");
        int num = sc.nextInt();
        boolean found = false;
        for(int i=0;i<5;i++)

        {
            if(num == arr[i])
            {
                found = true;
                System.out.print("YOUR NUMBER IS PRESENT");

                break;
            }
        }
        if (!found) 

        {
            System.out.print("YOUR NUMBER IS NOT PRESENT");
        }
}
}
