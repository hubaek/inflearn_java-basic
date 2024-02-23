package oop1.ex;

public class Account {
    int balance;    // 잔액

    void deposit(int amount) { // 입금 메서드
        // 입금시 잔액이 증가한다.
        balance += amount;
    }

    void withdraw(int amount) {
        // 출금시 잔액이 감소한다.
        // 만약 잔액이 부족하면 "잔액 부족"을 출력해야 한다.
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }

    }
}
