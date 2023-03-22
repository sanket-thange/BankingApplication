package com.sanket;

public class Account {
        private int AccNumber;
        private int Balance;
        private String Name;
        private String Email;
        private String PhoneNumber;

        public Account(int AccNumber, int Balance, String Name, String Email ,String
                       PhoneNumber){

                this.AccNumber= AccNumber;
                this.Balance = Balance;
                this.Name=Name;
                this.Email= Email;
                this.PhoneNumber=PhoneNumber;


        }

        public void DepositedMoney(int DepositedMOney){
                this.Balance= this.Balance+DepositedMOney;
                System.out.println("Money is Deposited Successfully....");
        }

        public void WithdrawMoney(int withdrawMoney)
        {
                this.Balance-=withdrawMoney;
                System.out.println("Money is withdrawn Successfully....");
        }


        public int getAccNumber() {
                return AccNumber;
        }

        public void setAccNumber(int accNumber) {
                AccNumber = accNumber;
        }

        public int getBalance() {
                return Balance;
        }

        public void setBalance(int balance) {
                Balance = balance;
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public String getEmail() {
                return Email;
        }

        public void setEmail(String email) {
                Email = email;
        }

        public String getPhoneNuber() {
                return PhoneNumber;
        }

        public void setPhoneNuber(String phoneNuber) {
                PhoneNumber = phoneNuber;
        }
}
