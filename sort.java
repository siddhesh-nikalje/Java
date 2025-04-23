import java.util.Scanner;

public class sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[5];
        
        System.out.println("Enter the elements of the array:");
        for(int a = 0; a < n; a++) 
        {
            arr[a] = sc.nextInt();
        }
        int temp;
        for(int a = 0; a < n - 1; a++) 
        {
            for(int b = a + 1; b < n; b++) 
            {
                if(arr[a] > arr[b]) 
                {
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int a = 0; a < n; a++)
        {
            System.out.print(arr[a] + " ");
        }
        System.out.println();
    }
}
