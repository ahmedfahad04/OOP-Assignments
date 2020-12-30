package Account_Management_System;

public class Account_info {
    private String account_holder_name ;
    private String account_holder_mobile_number;
    private int balance;

    // constructor
    public Account_info(String user_name, String user_phone){
        this.account_holder_name = user_name;
        this.account_holder_mobile_number = user_phone;
    }

    // cash out
    void cash_out(int amount){
        if(amount > balance){
            System.out.println("Cash out Failed due to insufficient Balance.");
        }
        else {
            this.balance -= amount;
            System.out.println("Cash Out: " + amount);
        }
    }

    // add money
    void add_money(int amount2){
        this.balance += amount2;
        System.out.println("Cash in: " + amount2);
    }

    // show balance
    void my_balance(){
        System.out.println("Current Balance: " + this.balance);
    }

    // show user name
    public void getAccount_holder_name(){
        System.out.println("Name: " + this.account_holder_name);
    }

    // show user phone number
    public void getAccount_holder_mobile_number(){
        System.out.println("Cell: " + this.account_holder_mobile_number);
    }

}
