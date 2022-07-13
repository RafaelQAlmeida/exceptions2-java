package application;

import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            sc.nextLine();
            System.out.print("Initial balance: $");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: $");
            Double limit = sc.nextDouble();
            Account account = new Account(number, holder,limit);
            account.deposit(balance);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);

            System.out.println("New balance: $" + String.format("%.2f",account.getBalance());
        } catch (Exception e){
            System.out.println("error" + e.getMessage());
        }

        sc.close();
    }
}
