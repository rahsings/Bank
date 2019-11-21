package com.fyle.bank.dao;

import java.util.List;

import com.fyle.bank.model.BankDetails;

public interface BankInterface {

	List<BankDetails> findBankByIfsc(String ifsc, int offset, int limit);

	List<BankDetails> findBanksByName(String bankName, String city, int offset, int limit);
}
