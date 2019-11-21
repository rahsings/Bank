package com.fyle.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="branches")
public class Branches {
	
	@Column(name="bank_id")
	private Long bank_id;
	
	@Id
	@Column(name="ifsc")
	private String ifsc;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="district")
	private String district;
	
	@Column(name="state")
	private String state;
	
	@OneToOne
		@JoinColumn(name="id")
	private Banks bank;
	
	public Branches() {}

	public Branches(Branches branche) {
		super();
		this.bank_id =branche.getBank_id() ;
		this.ifsc = branche.getIfsc();
		this.branch = branche.getBranch();
		this.address = branche.getAddress();
		this.city = branche.getCity();
		this.district = branche.getDistrict();
		this.state = branche.getState();
		this.bank = branche.getBank();
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Banks getBank() {
		return bank;
	}

	public void setBank(Banks bank) {
		this.bank = bank;
	}
	
	
}
