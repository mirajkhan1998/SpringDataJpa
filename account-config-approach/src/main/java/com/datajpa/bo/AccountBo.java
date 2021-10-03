package com.datajpa.bo;

public class AccountBo {

	protected int accountNo;
	protected String accountHolderName;
	protected String accountType;
	protected String branch;
	protected double balance;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountBo [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", branch=" + branch + ", balance=" + balance + "]";
	}

}
