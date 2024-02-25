package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальный баланс: ");
        double initialBalance = scanner.nextDouble();

        try {
            Account account = new Account(initialBalance);
            System.out.println("Начальный баланс: " + account.getBalance());

            System.out.print("Введите сумму депозита: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            System.out.println("Баланс после депозита: " + account.getBalance());

            System.out.print("Введите сумму для снятия: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.println("Баланс после снятия: " + account.getBalance());

            System.out.print("Введите сумму для снятия: ");
            withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount); // Превышение баланса
            System.out.println("Баланс после снятия: " + account.getBalance());
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}