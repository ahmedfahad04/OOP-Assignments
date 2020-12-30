package Account_Management_System;

import java.util.Scanner;

public class User {
    public void show_account_details(){
        int count = 1;
        Scanner sc = new Scanner(System.in);
        Account_info first = new Account_info();
        System.out.println("Enter Account details to open your account: ");

        System.out.println("Enter your name: ");
        String user_name = sc.nextLine();
        System.out.println("Enter your mobile number: ");
        String user_number = sc.nextLine();
        System.out.println("Enter Initial Deposit amount: ");
        int cash_in = sc.nextInt();
        System.out.println("Account Created Successfully!!\n");

        System.out.println("Enter Cash out Amount: ");
        int cash_out = sc.nextInt();

        first.add_money(cash_in);
        first.cash_out(cash_out);
        first.setname(user_name);
        first.setnumber(user_number);

        System.out.println("\n##################### Account Details #####################\n");
        System.out.println("Name: " + first.getAccount_holder_name());
        System.out.println("Mobile no. " + first.getAccount_holder_mobile_number());
        System.out.println("Added Money: " + cash_in);
        System.out.println("Cashed out: " + cash_out);

        if(cash_in>=cash_out) {
            System.out.println("Remaining Balance: " + first.my_balance());
        }
        else System.out.println("Cash Out Failed!! Not enough balance for cashing out");

    }
}
