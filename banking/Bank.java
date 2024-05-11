package banking;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void openAccount(String accountNumber, String accountHolderName) {
        Account account = new Account(accountNumber, accountHolderName);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            boolean success = account.withdraw(amount);
            if (success) {
                System.out.println("Withdrawal successful.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
