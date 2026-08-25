import java.util.Scanner;
public class BasicsOfJava{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
        int x=sc.nextInt();
        char ch=(char)x;
        System.out.print("The character value of the numberis"+  ch);
    }
}