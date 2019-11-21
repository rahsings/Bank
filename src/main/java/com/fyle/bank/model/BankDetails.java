package com.fyle.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.SortableField;
import org.hibernate.search.annotations.Store;

@Entity
@Indexed
@Table(name = "bank_branches")
public class BankDetails {

	@Id
	@SortableField
	@Column(name = "ifsc")
	private String ifsc;

	@Column(name = "bank_id")
	private Long bank_id;

	@Column(name = "branch")
	private String branch;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	@Field(index=Index.YES,analyze =Analyze.YES,store = Store.NO)
	private String city;

	@Column(name = "district")
	private String district;

	@Column(name = "state")
	private String state;

	@Column(name = "bank_name")
	@Field(index=Index.YES,analyze =Analyze.YES,store = Store.NO)
	private String bank_name;

	public BankDetails() {
	}

	public BankDetails(BankDetails branches) {
		this.bank_id = branches.getBank_id();
		this.address = branches.getAddress();
		this.city = branches.getCity();
		this.district = branches.getDistrict();
		this.branch = branches.getBranch();
		this.state = branches.getState();
		this.ifsc = branches.getIfsc();
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
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

}
