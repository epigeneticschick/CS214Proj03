Script started on Wed 20 Feb 2019 09:37:16 AM EST
llw5@gold12:~/cs214/proj03$ cat letter_grades.java
/** Purpose to change a numerical grade to a letter grade
 *Author: Lorrayya Williams
 *Date: February 15, 2019
 *Input: Interger Average
 *Output: A, B, C, D, F
 */
import java.util.Scanner;

public class letter_grades{

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("\nEnter your numerical grade: "); // prompt

      int  average = in.nextInt();      // read numerical score
      System.out.println(convertgrade(average)); // display its code
   }
    public static char  convertgrade(int average){

      switch (average / 10)
      {
         case 10: case 9:
            return 'A';
         case 8:
            return 'B';
         case 7:
            return 'C';
         case 6:
            return 'D';
         default:
            return 'F';
      }
   }
}
llw5@gold12:~/cs214/proj03$ javac -deprecation letter_grades, .java
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
100
A
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
90
A
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
7 80
B
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
^[[A    70
C
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
60
D
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
50
F
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
83
B
llw5@gold12:~/cs214/proj03$ java letter_grades

Enter your numerical grade: 
77
C
llw5@gold12:~/cs214/proj03$ exit

Script done on Wed 20 Feb 2019 09:38:58 AM EST
