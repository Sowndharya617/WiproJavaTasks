import java.util.Scanner;
public class Program2 {
    static void welcomedisplay(String a ){
        System.out.println("Welcome "+a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        welcomedisplay(name);
    }
}
