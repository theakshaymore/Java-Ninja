package day11_GA;

public class ExceptionTester {
    public static void main(String[] args) {
    	
    	Account a1 = new Account(1001, 5000);
    	Account a2 = new Account(1002, 3000);
    	Account a3 = new Account(1003, 3000);
        AccountList al = new AccountList();
        al.addAccount(a1);
        al.addAccount(a2);
        al.addAccount(a3);

        AccountManager am = new AccountManager(al);  
        System.out.println(am.checkAccount(1001) ? "Account FOUND" : "Account NOT FOUND"); 
        System.out.println(am.checkAccount(1004)? "Account FOUND" : "Account NOT FOUND"); 
        System.out.println("============================================================");
       
        
        
        try {
            System.out.println(am.deposit(1001, 1000)); 
            System.out.println(am.deposit(100, 1000)); 
        } catch (NegativeAmountException | InvalidAccountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("============================================================");
        try {
            System.out.println(am.withdraw(1001, 2000)); 
            System.out.println(am.withdraw(1002, 4000));
            System.out.println(am.withdraw(1004, 1000)); 
            System.out.println(am.withdraw(1001, -1000));
        } catch (NegativeAmountException | InsufficientFundsException | InvalidAccountException e) {
            System.out.println(e.getMessage());
        }
    }
}

