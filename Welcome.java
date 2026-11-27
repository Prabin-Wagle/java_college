
import java.util.Scanner; //java.util.package -> for Scanner class that is used to take input from keyboards

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Welcome " + name + "! Next year you will be " + (age + 1) + " .");
        sc.close();
    }
}
