package Programs;
import java.util.*;
/* Adding elements in the array from 1 to size.
*/	
public class Arrange_numbers_in_array {
	public static void main(String args[])
	{
		System.out.print("Enter the size of the array : ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr= new int[size];
		arrange(arr,size);
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
	}
	public static int[] arrange(int arr[],int n){
				
int count=0,i;
      for(i=1;i<=n;i+=2)
        arr[count++]=i;
      if(n%2==0)
        i--;
      else
        i-=3;
      for(;i>0;i-=2)
        arr[count++]=i;
      return arr;
	}
}
