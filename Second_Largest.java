package Programs;
import java.util.*;
public class Second_Largest {
	public static void main(String[] args) {
		int size=0;
		System.out.print("Enter the size of the array : ");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int arr[]=new int[size];
		input(arr,size);
		int x= secondLargestElement(arr);
		System.out.println();
		System.out.print("Second Largest Element in the array is  : "+x);
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
	public static int secondLargestElement(int[] arr) {
      int flag=0;
	     int n=Integer.MIN_VALUE;
	     int x=Integer.MIN_VALUE;
      int temp=0;
	     if(arr.length<=1)
	    	 System.out.println(x);
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(n<arr[i])
	    		n=arr[i];
	    	if((x<n&&x<arr[i])&&(arr[i]!=n))
	    		x=arr[i];
          		if(x<temp&&temp!=n)
            		x=temp;
          temp=n;
	    }
	    	return x;
	}

}
