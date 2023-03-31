package day11_GA;

import java.util.ArrayList;

public class AccountList extends Exception {
	
	private ArrayList<Account> accountList;
	
	public AccountList() {
        accountList = new ArrayList<Account>();
    }

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "AccountList [accountList=" + accountList + ", getAccountList()=" + getAccountList() + "]";
	}
	
	public void addAccount(Account a1) {
        accountList.add(a1);
    }
	
	
}
