package day11_GA;

public class AccountManager {
	private AccountList accountList;

    public AccountManager(AccountList accountList) {
        this.accountList = accountList;
    }

    public boolean checkAccount(int accountNo) {
        for (Account a1 : accountList.getAccountList()) {
            if (a1.getAccountNumber() == accountNo) {
                return true;
            }
        }
        return false;
    }

    public double deposit(int accountNo, double amount) throws NegativeAmountException, InvalidAccountException {
        if (amount < 0) {
            throw new NegativeAmountException("Negative amount");
        }

        Account a1 = findAccount(accountNo);
        double balance = a1.getBalance();
        balance = balance + amount;
        a1.setBalance(balance);
        return balance;
    }

    public double withdraw(int accountNo, double amount) throws InsufficientFundsException, NegativeAmountException, InvalidAccountException {
        if (amount < 0) {
            throw new NegativeAmountException("Negative amount");
        }

        Account a1 = findAccount(accountNo);
        double balance = a1.getBalance();
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance = balance - amount;
        a1.setBalance(balance);
        return balance;
    }

    private Account findAccount(int accountNo) throws InvalidAccountException {
        for (Account a1 : accountList.getAccountList()) {
            if (a1.getAccountNumber() == accountNo) {
                return a1;
            }
        }
        throw new InvalidAccountException("Account NOT FOUND");
    }
}
