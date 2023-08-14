package problemSet2;
import java.util.Random;
import java.util.Scanner;

/*
 * ATM Simulation program. Handles:
 * -Balance check
 * -Withdraw
 * -Deposit
 * Includes error handling for insufficient funds and invalid selections
 */

public class Atm {
    private int initBalance;

// Set balance for user with random value
    public Atm(){
        Random rand = new Random();
        int bal = rand.nextInt(10000);
        this.initBalance = bal;
    }

// Set balance for a user with input
    public Atm(int balance){
        this.initBalance = balance;
    }

// Operation for checking balance
    private int getBalance(){
        return this.initBalance;
    }
    
// Operation for depositing money
    private void deposit(int money){
        this.initBalance += money; 
    }

// Logic for checking deposit amount prior to depositing
    public void promptDeposit(){
        int money = 0;
        Scanner input = new Scanner(System.in);

        while (money < 1){
            System.out.print("\nEnter amount to deposit: $");
            money = input.nextInt();
            
            if (money >=1){
                deposit(money);
                
                System.out.println("Your new balance is $" + getBalance() + ".00");
            }
            else
                errMsg();
        }
    }

// Operation for withdrawing money
    private void withdraw(int money){
        this.initBalance -= money;
    }

    public void promptWithdraw(){
        int money = 0;
        Scanner input = new Scanner(System.in);

        while (money < 1){
            System.out.print("\nEnter amount to withdraw: $");
            money = input.nextInt();

            if (money >= 1){
                if (moneyCheck(money)){
                    withdraw(money);
                    System.out.println("\nYour balance is: $" + getBalance() + ".00");
                }
                else{
                System.out.println("\nERROR:\nInsufficient funds, try again.");
                money = 0;
                }
            }
            else
                errMsg();
        }
    }

    private boolean moneyCheck(int money){
        if ( (this.initBalance - money) > 0 )
            return true;
        return false;
    }
    public static void errMsg(){
        System.out.println("\nERROR:\nEnter amount of 1 dollar or greater.\n");
    }

    public static void promptUser(){
        System.out.println("\nEnter Selection:\n1: Check Balance\n2: Desposit");
        System.out.println("3: Withdraw\n7: Exit");
    }
    public static void main(String args[]){
        int select = 0;
        Scanner in = new Scanner(System.in);
        Atm usr = new Atm(1000);


        while(select != 7){
            promptUser();
            select = in.nextInt();

            switch(select){
                case 1:
                    System.out.println("\nBALANCE:   $" + usr.getBalance());
                    break;
                case 2:
                    usr.promptDeposit();
                    break;
                case 3:
                    usr.promptWithdraw();
                    break;
                case 7:
                    System.out.println("\nThank you, have a great day!");
                    break;
                default:
                    System.out.println("\nInvalid selection, please try again.");
                    break;
            }
        }

        in.close();
    }


}
