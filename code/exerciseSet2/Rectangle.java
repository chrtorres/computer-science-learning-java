package exerciseSet2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]){
        int length, width;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a length and width to calculate the area.");
        System.out.print("Length: ");
        length = input.nextInt();
        System.out.print("Width: ");
        width = input.nextInt();
        
        System.out.println("Calculated Area: " + area(length, width));
    }
public static int area(int x, int y){
    return x * y;
}
}

