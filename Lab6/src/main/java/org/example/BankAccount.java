package org.example;

public class BankAccount {
    private String accountNumber;
    private float balance;

    public BankAccount(String accNumber, float balance){
        if(balance>=0) {
            accountNumber = accNumber;
            this.balance = balance;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public BankAccount(String accountNumber){
        accountNumber = accountNumber;
        this.balance = 0;
    }


    void deposit(float amount) throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException();
        }else{
            balance+=amount;
        }
    }

    void withdraw(float amount){
        if(amount>balance){
            throw new IllegalArgumentException();
        } else if (amount < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        } else{
            balance-=amount;
        }
    }

    float getBalance(){
        return balance;
    }
}
