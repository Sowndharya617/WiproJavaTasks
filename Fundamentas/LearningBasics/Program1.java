import java.util.*;
public class Main {
    static void display(String c,String l){
        System.out.println(c +" Technologoes "+l);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name : " );
        String company = sc.next();
        System.out.println("Location name : " );
        String location = sc.next();
        display(company,location);
        }
    }
