package com.fyle.bank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyle.bank.dao.BankInterface;
import com.fyle.bank.model.BankDetails;

@Service
public class BankService{
	
	public static final Logger logger=LoggerFactory.getLogger(BankService.class);

	@Autowired
	BankInterface bankDaoInterface;
    
    public List<BankDetails> getBankByIfsc(String ifsc,int offset,int limit){
    	List<BankDetails> bank = bankDaoInterface.findBankByIfsc(ifsc, offset, limit);
    	logger.info("The bank Details with ifsc--------------------->"+bank.size());
    	return bank;
    }
    
    public List<BankDetails> getBankByBankNameAndCity(String bankName,String city,int offset,int limit) {
    	List<BankDetails> bank = bankDaoInterface.findBanksByName(bankName, city, offset, limit);
    	logger.info("The bank Details with BankName--------------------->"+bank.size());
    	return bank;
    }
}
