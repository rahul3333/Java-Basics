package Programs;
import java.util.*;
public class Swap_alternate_pairs {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size=s.nextInt();
		int[] arr=new int[size];
		int j=1;
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the element "+ j++ + " of the array : ");
			arr[i]=s.nextInt();
		}
		System.out.print("Array formed is : ");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
		swapAlternate(arr);
		System.out.println();
		System.out.print("Array After Swapping Every Alternate Pairs is : ");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
	public static void swapAlternate(int[] input){
	int temp,i;
      for(i=0;i<input.length-1;i=i+2)
      {
        temp=input[i];
        input[i]=input[i+1];
        input[i+1]=temp;
      }
	}
}
