package section1;
/*
 * Mathematical notation:
 * n! = n * (n-1) * (n-2) * ... * 1
 */

public class Recursion {
    
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0)
            return 1;
        
        // recursive case: n! = n* (n - 1)
        return n * factorial(n - 1);
    }

    public static void main (String args[]){

        System.out.println("Factorial of 5 is " + factorial(5) + ".");
    }

}
