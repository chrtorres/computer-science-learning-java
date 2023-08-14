package problemSet2;

import java.util.Scanner;

/*
 * Prompts user for age and determines whether they 
 * are eligible to vote.
 * 
 */
public class Voting {
    
    public static void main(String args []){
        int voter_age;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your age to determine eligibility:\t");
        voter_age = in.nextInt();
        boolean check = logic(voter_age); // Check for age, true if 18+, else false

        if (check)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are not eligible to vote.");


    }

    public static boolean logic(int age){
        if (age >= 18 )
            return true;
            
        return false;
    }
}
