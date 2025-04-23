import java.util.Arrays;
import java.util.Scanner;
public class SecondMaximum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i;
        for(i=0;i<5;i++) 
        {
            System.out.println("Enter the element " + (i+1) + ":");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The Second Maximum value is:-"+arr[arr.length-2]); 
    }
}
