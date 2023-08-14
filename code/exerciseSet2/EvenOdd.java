package exerciseSet2;
/*
 * Take in user number and determine whether the number is even or odd
 */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        while (number != -1) {
            prompt();
            number = input.nextInt();
            logic(number);
        }

    }

    public static void prompt() {
        System.out.println("System: Input a number to determine whether it is even or odd.");
        System.out.println("System: Enter -1 to exit.");
        System.out.print("You: ");
    }

    public static void logic(int num) {

        if (num % 2 == 0)
            System.out.println("The number " + num + " is even.");
        else if (num == -1)
            System.out.print("");
        else
            System.out.println("The number " + num + " is odd.");
    }
}
