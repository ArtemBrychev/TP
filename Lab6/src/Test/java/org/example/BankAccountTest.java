package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void ConstTest(){
        //ok
        var acc1 = new BankAccount("2424", 456);
        assertEquals(456, acc1.getBalance());
        //negative balance
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("2434", -34);
        });
        //0 default value
        var acc2 = new BankAccount("12345");
        assertEquals(0, acc2.getBalance());
    }

    @Test
    void WithdrawTest(){
        var acc1 = new BankAccount("1234567", 1500);
        //>balance
        assertThrows(IllegalArgumentException.class, ()->{
            acc1.withdraw(2000);
        }, "Insufficient funds");
        //<0
        assertThrows(IllegalArgumentException.class, ()->{
            acc1.withdraw(-45);
        });
        //ok
        acc1.withdraw(500);
        assertEquals(1000, acc1.getBalance());
    }

    @Test
    void depositTest(){
        var acc = new BankAccount("123456", 0);
        //ok
        acc.deposit(500);
        assertEquals(500, acc.getBalance());
        //negative deposit
        assertThrows(IllegalArgumentException.class, ()->{
            acc.deposit(-45);
        });
    }
}