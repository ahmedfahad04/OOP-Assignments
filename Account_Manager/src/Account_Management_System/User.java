package Account_Management_System;


public class User {
    public void show_account_details(){
        Account_info asif = new Account_info("Asif Ahmed Chowdhury", "01766680017", "7412");
        Account_info safiyah = new Account_info("Safiyah Sultana", "01766610085", "8523");


        asif.getAccount_holder_name();
        asif.getAccount_holder_mobile_number();

        asif.add_money(4000);
        asif.cash_out(1500, "7412");

        asif.my_balance();

        System.out.println("-----------------------------------------------\n");
        safiyah.getAccount_holder_name();
        safiyah.getAccount_holder_mobile_number();

        safiyah.add_money(2500);
        safiyah.cash_out(3000, "8532");

        safiyah.my_balance();


    }
}
