import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Age: ");
		int age = input.nextInt();		
		
		System.out.println(age + " is your Entered AGE " + age);
		System.out.printf("%d is your Entered AGE",age);

    }
}
        