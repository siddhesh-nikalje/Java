import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st Number: ");
		int num1 = input.nextInt();		

		System.out.print("Enter 1st Number: ");
		int num2 = input.nextInt();	
		
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		System.out.printf("Addition of %d and %d is %d",num1,num2,num1+num2);

    }
}
        