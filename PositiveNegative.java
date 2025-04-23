import java.util.Scanner;

class Voter {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Age: ");
		int num = input.nextInt();

		if(num>18){
			System.out.println("NOT ELIGIBLE");
		}
		else if(num==0){
			System.out.println("Zero is Neutral");
		}
		else{
			System.out.println("Negative");
		}
				

    }
}






/*
Arithmetic Operators
+
-
*
/
%


Relational Op
>
<
>=
<=
==
!=


Logical 
&&
||
!


Assig Op
=
+=
-=
*=
/=
%=

*/

        