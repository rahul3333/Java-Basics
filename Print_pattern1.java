package Programs;
import java.util.*;
/*
 * To print the following pattern
 *  1
	11
	111
	1111*/
public class Print_pattern1 {
	public static void main(String[] args) {
		// Write your code here
	int n,i,j;
	System.out.print("How many rows do you want : ");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.println("Pattern is ");
      for(i=0;i<n;i++)
      {
        for(j=0;j<=i;j++)
          System.out.print(1);
         System.out.print("\n");
      }
	}
}
