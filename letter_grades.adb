--letter_grades.adb changes percent grade to a letter grade
-- Lorrayya Williams
-- February 18, 2019
-- Input: Percentage Grade
-- Precondition: An Integer 100 or below
-- Output: The Letter grade
------------------------------------------------
with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;

procedure letter_Grades is
   Average: Integer;


   function LetterGraded(Average:Integer) return Character is
     begin
	case (Average/10) is
	   when 10 =>
	      return 'A';
	   when 9 =>
	   return 'A';
	when 8 =>
	   return 'B';
	when 7 =>
	   return 'C';
	when 6 =>
	   return 'D';
	when others =>
	   return 'F';
     end case;
end LetterGraded;

begin
   Put("Enter your numerical grade: ");           -- Prompt for input
   Get(Average);                   -- Input
   Put( letterGraded(Average) );                       -- Convert and output
   New_Line;

end letter_Grades;
