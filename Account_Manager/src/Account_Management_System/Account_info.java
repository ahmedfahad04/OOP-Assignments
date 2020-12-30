package Account_Management_System;

public class Account_info {
    private String account_holder_name ;
    private String account_holder_mobile_number;
    private double balance;
    private String pin;


    // constructor
    public Account_info(String user_name, String user_phone, String user_pin){
        this.account_holder_name = user_name;
        this.account_holder_mobile_number = user_phone;
        this.pin = user_pin;
    }

    // cash out
    void cash_out(int amount, String pin_code){
        if(this.pin == pin_code){
            if(amount > balance){
                System.out.println("Cash out Failed due to insufficient Balance.");
            }
            else {
                this.balance -= amount;
                System.out.println("Cash Out: " + amount);
            }
        }
        else{
            System.out.println("Wrong Password. Access Denied!");
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
