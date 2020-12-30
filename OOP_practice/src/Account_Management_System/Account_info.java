package Account_Management_System;

public class Account_info {
    private String account_holder_name ;
    private String account_holder_mobile_number;
    private int balance;


    //private String pin;

    void cash_out(int amount){
        if(amount > balance){
            return;
        }
        else {
            this.balance -= amount;
        }
    }

    void add_money(int amount2){
        this.balance += amount2;
    }

    int my_balance(){
        return this.balance;
    }

    void setname(String name){
        this.account_holder_name = name;
    }

    void setnumber(String num){
        this.account_holder_mobile_number = num;
    }

    public String getAccount_holder_name(){
        return account_holder_name;
    }

    public String getAccount_holder_mobile_number(){
        return account_holder_mobile_number;
    }

}
