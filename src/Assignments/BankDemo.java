package Assignments;
import Jan23.Bank;

import java.util.Scanner;

/*
Use a do-while loop to repeatedly display a menu with the following options:
Deposit Withdraw Check Balance Exit Inside the loop, use an if-else statement to perform the
corresponding action based on the user's choice.
If the user chooses to deposit or withdraw, prompt them for the amount and update the account accordingly.
If they choose to check the balance, display the current balance.
Exit the loop when the user chooses to exit.
*/
public class BankDemo {
    public static void main(String[] args) {
        int choice = 1;
        double amount;
        Scanner sc = new Scanner(System.in);
        Jan23.Bank bank = new Bank();
        do {
            System.out.println("Welcome to the Bank System");
            System.out.println("Choose the function 1. Deposit. 2. Withdraw, 3. Exit");
            choice = sc.nextInt();
            if (choice == 1){
                System.out.println("Enter the amount");
                amount = sc.nextDouble();
                bank.deposit(amount);
                bank.showBalance();
            }
            else if (choice == 2) {
                System.out.println("Enter the amount");
                amount = sc.nextDouble();
                bank.withdraw(amount);
                bank.showBalance();
            }
            else if (choice == 3){
                break;
            }
        }while(choice != 3);
    }
}
