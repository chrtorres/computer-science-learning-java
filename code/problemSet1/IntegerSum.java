package problemSet1;

import java.util.Scanner;

public class IntegerSum {
    
    public static void main( String args[]){
        int a;
        int b;        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers to be added together:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Result: " + add(a, b));
    }

    public static int add(int a, int b){
        return a + b;
    }
}
