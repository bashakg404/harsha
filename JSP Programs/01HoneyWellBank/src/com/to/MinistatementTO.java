package com.to;

import java.util.Date;

public class MinistatementTO {
	private String name;
	private int transactionId;
	private int accnumb;
	private String transactiontype;
	private Date date;
	private int amount;
	private String desc;
	
	public final int getTransactionId() {
		return transactionId;
	}
	public final void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public final String getTransactiontype() {
		return transactiontype;
	}
	public final void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public final Date getDate() {
		return date;
	}
	public final void setDate(Date date) {
		this.date = date;
	}
	public final int getAmount() {
		return amount;
	}
	public final void setAmount(int amount) {
		this.amount = amount;
	}
	public final String getDesc() {
		return desc;
	}
	public final void setDesc(String desc) {
		this.desc = desc;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getAccnumb() {
		return accnumb;
	}
	public final void setAccnumb(int accnumb) {
		this.accnumb = accnumb;
	}
	
	
}
