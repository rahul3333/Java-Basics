package Programs;
import java.util.Scanner;
public class Decimal_to_Binary {
	public static void main(String[] args) {
		long n,j,rem=0;
		System.out.print("Enter a Decimal Number : ");
	      Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	      long store=n;
	      long temp=0;
      long i = 1;
	      while(n>0)
	      {
	    	  rem=n%2;
	    	  temp=temp+(rem*i);
	    	  n=n/2;
            i=i*10;
	      }
	      System.out.println(store+" in Binary is : "+temp);
	     
	}
}
