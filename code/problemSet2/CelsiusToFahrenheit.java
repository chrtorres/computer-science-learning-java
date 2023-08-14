package problemSet2;

/*
 * Take user input in Celsius and return in Fahrenheit
 */

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static int fahrenheit(int c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String args[]) {
        int celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Input degrees in celsius.");
        System.out.print("You: ");
        celsius = input.nextInt();
        System.out.println("Temperature in Fahrenheit: " + fahrenheit(celsius));
    }

}
