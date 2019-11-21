package com.fyle.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banks")
public class Banks {

	public Banks() {
	}

	public Banks(Banks bank) {
		this.id = bank.getId();
	}

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String bankName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
