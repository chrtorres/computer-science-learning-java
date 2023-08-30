package exerciseSet2;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number to print 'n' Fibonacci numbers.");
        n = input.nextInt();
        fib(n);

    }

    public static void fib(int num){
        if ( num ==  0){
            System.out.println("0");
        }

        else if ( num ==  1){
            System.out.println("0");
            System.out.println("1");
        }
        else{
            int first = 0, second = 1;
            System.out.println("0");
            System.out.println("1");
            for(int i = 2; i <= num; i++){
                int next = first + second;
                System.out.println(next);
                first = second;
                second = next;
            }
        }
    }
}