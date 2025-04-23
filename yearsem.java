import java.util.*;
public class yearsem 
{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER YOU YEAR:-");
    int year = sc.nextInt();
    System.out.print("ENTER YOU SEM:-");
    int sem = sc.nextInt();
    switch(year)
    {
        case 1:
            switch (sem) 
            {
                case 1:
                System.out.println("FIRST YEAR FIRST SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'BEE','M1','EM','SME'");
                break;
                case 2:
                System.out.println("FIRST YEAR SECOND SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'EG','M2','BXE','CHEMISTRY'");
                break;
            }
         case 2:
            switch(sem)
            {
                case 3:
                System.out.println("SECOND YEAR THIRD SEMESTER"); 
                System.out.println("YOUR SUBJECT ARE 'DEL','M3','DSA'SPOS'");
                break;
                case 4:
                System.out.println("SECOND YEAR FOURTH SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'DM','M5','SALMAN','SHAHRUKH'");
                break;
            }
         case 3:
            switch(sem)
            {
                case 5:
                System.out.println("THIRD YEAR FIFTH SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'M4','DBMS','OS','DM'");
                break;
                case 6:
                System.out.println("THIRD YEAR SIXTH SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'TOC','CNS','DBMS','SDBMS'");
                break;
            }
         case 4:
            switch(sem)
            {
                case 7:
                System.out.println("FORTH YEAR SEVENTH SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'A','B','C','D'");
                break;
                case 8:
                System.out.println("FOURTH YEAR EIGHTH SEMESTER");
                System.out.println("YOUR SUBJECT ARE 'E','F','G','H'");
                break;

         }
     }
    }   
}
