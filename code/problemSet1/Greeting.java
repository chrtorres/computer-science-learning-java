package problemSet1;
import java.util.Scanner;

/*
 * Take in user name as input and return a greeting (ie "Hello [Name]")
 */
public class Greeting {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name for a personalized greeting:");
        String name = input.nextLine();
        greet(name);
    }

public static void greet(String name){
    System.out.println("Hello " + name + "!");
}

}
