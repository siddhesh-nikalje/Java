import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class listmark
{
public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> marksList = new ArrayList<Integer>();
        int totalMarks = 0;

        System.out.println("Enter marks for 5 subjects:");
        int sum=0;
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Subject" +(i+1)+ ":-");
            Integer mark = scanner.nextInt(); 
            sum=sum+mark;
            marksList.add(mark);
        }
        System.out.println("Total marks are:-"+sum);
        double percentage = (double)sum / 100* 100;
        System.out.print(percentage);
}
}