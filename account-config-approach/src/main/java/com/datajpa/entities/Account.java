package com.datajpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_data_jpa")
public class Account implements Serializable {
	@Id
	@Column(name = "account_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int accountNo;
	@Column(name = "account_holder_nm")
	protected String accountHolderName;
	@Column(name = "account_opened_dt")
	protected Date accountOpenedDate;
	@Column(name = "account_type")
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

	public Date getAccountOpenedDate() {
		return accountOpenedDate;
	}

	public void setAccountOpenedDate(Date accountOpenedDate) {
		this.accountOpenedDate = accountOpenedDate;
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

}
