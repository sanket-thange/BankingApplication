package com.sanket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account acc1 = new Account(101,5000,"Sanket_Thange",
                "sanketthange2002@gmail.com","9146907101");

        acc1.DepositedMoney(5000);
        System.out.println(acc1.getBalance());
        acc1.WithdrawMoney(4000);
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getAccNumber());
        System.out.println(acc1.getName());
        System.out.println(acc1.getEmail());
        System.out.println(acc1.getPhoneNuber());




    }
}
