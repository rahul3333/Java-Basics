package Programs;
import java.util.*;
/*
 * To print the following pattern
 *  1
	11
	202
	3003*/
public class Print_pattern2 {
	public static void main(String[] args) {
		int n,i,j,num=2;
		System.out.print("How many rows do you want : ");
	      Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	      System.out.println("Patter is : ");
	      for(i=0;i<n;i++)
	      {
	        if(i<2)
	        for(j=0;j<=i;j++)
	          System.out.print(1);
	        if(i>1)
	        {
	          for(j=i;j<=i;j++)
	          System.out.print(num);
	        for(j=2;j<=i;j++)
	          System.out.print(0);
	        for(j=i;j<=i;j++)
	          System.out.print(num);
	          num++;
	        }
	        System.out.print("\n");
      }
	}
}
