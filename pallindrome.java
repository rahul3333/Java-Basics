import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        num=sc.nextInt();
        int temp=num;
        int rem=0;
        while(temp!=0){
            rem=rem*10+temp%10;
            temp=temp/10;
        }
        if(rem==num){
            System.out.println("Number is Pallindrome");
        }
        else{
            System.out.println("Number is not Pallindrome");
        }
        sc.close();

    }
}
