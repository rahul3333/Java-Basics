package Programs;
import java.util.*;
public class Find_character_case {
	public static void main(String[] args) {
		// Write your code here
	char ch;
	System.out.print("Enter a Character : ");
      Scanner s=new Scanner(System.in);
      ch=s.next().charAt(0);
      checkchar(ch);
    }
  static void checkchar(int ch)
  {
    if(ch>=65 && ch<=90)
       System.out.println(1); 				//1 for uppercase
    else if (ch>=97 && ch<=122)
        System.out.print(0);				//0 for lowercase
       else
         System.out.print(-1);				//-1 for any other character (special characters or others)      										
      }
}
