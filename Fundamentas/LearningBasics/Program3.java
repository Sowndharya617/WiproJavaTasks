import java.util.*;
public class Program3 {
    static int add(int  a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = sc.nextInt();
        int sum=add(num1,num2);

        System.out.print("Sum of "+num1 +" "+ num2+" is "+sum);
    }
}
