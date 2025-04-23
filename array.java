import java.util.Scanner;
public class array {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int i;

        for(i=0;i<5;i++){
            System.out.printf("Enter the %d element: ",i+1);
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(i=0;i<5;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        System.out.println("Maximum number is "+max);

    }  
}
