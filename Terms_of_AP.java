package Programs;
import java.util.*;
public class Terms_of_AP {
	public static void main(String args[]) {
		System.out.print("Enter the number terms you want in the series : ");
	Scanner s=new Scanner(System.in);
     int x=s.nextInt();
     int res=0,i,n=1;
     System.out.print("Terms of series 3n+2 which are not divisible by 4 and are in AP are : ");
     for(i=1;i<=x;i++)
     {
       res=(3*n)+2;
       if(res%4==0)
         i--;
       else
         System.out.print(res+" ");
       n++;
}
}
}
