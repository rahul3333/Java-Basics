package Programs;
import java.util.*;
public class Sum_of_Even_and_Odd {
	public static void main(String[] args) {
		// Write your code here
	int N,evensum=0,oddsum=0,rem;
	System.out.print("Enter a number : ");
      Scanner s=new Scanner(System.in);
      N=s.nextInt();
    while(N>0)
    {
      rem=N%10;
      if(rem%2==0)
        evensum+=rem;
      else
        oddsum+=rem;
      N=N/10;
    }
    System.out.println("Sum of even digits in "+N +" is : "+evensum);
    System.out.println("Sum of odd digits in "+N +" is : "+oddsum);
	}
}
