package com.userfront.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class SavingsTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date date;
	private String description;
	private String type;
	private String status;
	private double amount;
	private BigDecimal availableBalance;
	
	@ManyToOne
	@JoinColumn(name = "saving_account_id")
	private SavingsAccount savingsAccount;
	
	public SavingsTransaction() {
		
	}
	
	
	public SavingsTransaction(Date date, String description, String type, String status, double amount,
			BigDecimal availableBalance, SavingsAccount savingAccount) {
		super();
		this.date = date;
		this.description = description;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.savingsAccount = savingAccount;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	public SavingsAccount getSavingAccount() {
		return savingsAccount;
	}


	public void setSavingAccount(SavingsAccount savingAccount) {
		this.savingsAccount = savingAccount;
	}


	@Override
	public String toString() {
		return "SavingsTransaction [id=" + id + ", date=" + date + ", description=" + description + ", type=" + type
				+ ", status=" + status + ", amount=" + amount + ", availableBalance=" + availableBalance
				+ ", savingAccount=" + savingsAccount + "]";
	}


	
	
}
