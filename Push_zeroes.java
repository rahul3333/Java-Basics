package Programs;
import java.util.*;
public class Push_zeroes {
	public static void main(String[] args) {
		int size=0;
		System.out.print("Enter the size of the array : ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		pushZerosAtEnd(arr);
		System.out.println();
		System.out.print("Array after pushing zeroes to end is : ");
		display(arr,size);
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
	}
	public static void display(int[] arr, int size) {
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+"  ");
	}
	public static void pushZerosAtEnd(int[] arr){
int n=arr.length-1;
      int i,temp=0,j=0;
      for(i=0;i<n;i++)
      {
        if(arr[i]!=0)
	      arr[j++]=arr[i];
      }
        while(j<n)
          arr[j++]=0;
    }
}
