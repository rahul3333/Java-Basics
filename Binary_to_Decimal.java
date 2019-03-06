package Programs;
import java.util.*;
import static java.lang.Math.pow;
public class Binary_to_Decimal {
	public static void main(String[] args) {
		// Write your code here
int n,i=0,res=0,temp=0;
		System.out.print("Enter a Binary number : ");
	      Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	      int store=n;
	      while(n>0)
	      {
	     res=n%10;
	     res*=pow(2,i);
	     temp+=res;
	     n=n/10;
	     i++;
	      }
	      System.out.println(store+" in Decimal is : "+temp);
	}
}
