import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("enter a string:");
            Scanner scan= new Scanner(System.in);
            String ch=scan.nextLine();
        System.out.println(service1.reverse(ch));
        System.out.println(service1.minAsc(ch));
        System.out.println(service1.UpperLower(ch));
        }
    catch (Exception e) { System.out.println("Error"); System.out.println(e); } }}