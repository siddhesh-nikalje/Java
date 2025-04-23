import java.util.Scanner;
public class percentage{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        
        int sum = 0;
        float Percentage = 0;

        for (int i=0;i<5;i++){
            System.out.printf("Enter the marks of %d subjects: ",i+1);
            arr[i]=sc.nextInt();
            sum+=arr[i];   // sum = sum + arr[i]
        }
        
        Percentage = sum/5;
        System.out.println("Your Percentage is:-"+Percentage+"%");
    }
}
