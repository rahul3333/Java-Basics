package Programs;
import java.util.*;
public class Rotate_Array {
	public static void main(String[] args) {
		int size=0;
		System.out.print("Enter the size of the array : ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		System.out.print("Array after rotation is  : ");
		display(arr, size);
	}
	public static void input(int arr[],int size)
	{
		Scanner s=new Scanner(System.in);
		int j=1;
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the element "+ j++ +" of the array : ");
			arr[i]=s.nextInt();
		}
		System.out.print("Array formed is : ");
		display(arr,size);
		System.out.println();
		System.out.print("Enter the number by which you want to rotate the elements of the array to the left : ");
		int num=s.nextInt();
		rotate(arr,num);
	}
	public static void display(int[] arr, int size) {
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
	}
	public static void rotate(int[] arr, int d) {
int n,i,j=0;
	      n=arr.length;
	      int temp[]=new int[d];
	      for(i=0;i<d;i++)
	      	temp[i]=arr[i];
	      for(j=0;j<d;j++)
	    	  for(i=0;i<n-1;i++)
	    		  arr[i]=arr[i+1];
	      for(i=n-d,j=0;i<=n-1;i++,j++)
	      {
	        arr[i]=temp[j];
	      }
    }
}
