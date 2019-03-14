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
