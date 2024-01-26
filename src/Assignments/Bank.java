package Assignments;
/*
Create a Java program to simulate a basic banking system. The program should allow users to deposit or withdraw money
from their account. Implement a loop to repeatedly prompt the user for their choice until they choose to exit.
Use the following specifications:
Create a class BankAccount with instance variables balance (double) and accountNumber (int).
Include a constructor to initialize these variables.
Implement a method deposit(double amount) in the BankAccount class that adds the specified amount to the account balance.
Implement a method withdraw(double amount) in the BankAccount class that subtracts the specified amount from the account
balance.
Use a do-while loop to repeatedly display a menu with the following options:
Deposit Withdraw Check Balance Exit Inside the loop, use an if-else statement to perform the
corresponding action based on the user's choice.
If the user chooses to deposit or withdraw, prompt them for the amount and update the account accordingly.
If they choose to check the balance, display the current balance.
Exit the loop when the user chooses to exit.
*/
public class Bank {
    double balance;
    double accountNumber;

    public Bank(){
        balance = 1000;
        accountNumber = 123456789;
    }
    public void deposit(double amount){
        balance +=amount;
    }
    public void withdraw(double amount){
        balance -=amount;
    }
    public void showBalance(){
        System.out.println("Your Balance is: "+balance);
    }
}

