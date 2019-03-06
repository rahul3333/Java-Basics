package Programs;
import java.util.Scanner;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class Roots_of_quadratic_eq {
		
		public static void main(String[] args) {
			// Write your code here
		int a,b,c;
	      Scanner s=new Scanner(System.in);
	      System.out.println("For the equation in the form of : a(x^2) + bx + c = 0");
	      System.out.print("Enter the value of a : ");
	      a=s.nextInt();
	      System.out.print("Enter the value of b : ");
	      b=s.nextInt();
	      System.out.print("Enter the value of c : ");
	      c=s.nextInt();
	    calcroot(a,b,c);  
	    }
	  static void calcroot(int a,int b,int c)
	  {
	    float d;
	    double x,y;
	    d=(b*b)-4*a*c;
	       x=((-b+sqrt(d))/(2*a));
	       y=((-b-sqrt(d))/(2*a));
	      if(d>0)
	      {
	        System.out.println("Roots of equation "+a+"x^2 + "+b+"x + "+c+" are real and unequal and their values are : ");
	        System.out.print(round(x)+" "+round(y));
	      }
	      else if(d<0) {
	    	  System.out.println("No Roots for this Equation");
	        System.out.print(-1);}
	      else
	      {
	    	  System.out.println("Roots of equation "+a+"x^2 + "+b+"x + "+c+" are real and equal and their value is : ");
	        System.out.print(round(x)+" "+round(y));
	      }

	  }
	}
