package com.fyle.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fyle.bank.model.BankDetails;
import com.fyle.bank.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	BankService service;

	@GetMapping("/ifsc{?ifscCode,limit,offset}")
	public List<BankDetails> getByIfsc(@RequestParam("ifscCode") String ifscCode, @RequestParam("offset") int offset,
			@RequestParam("limit") int limit) throws InterruptedException {
		return service.getBankByIfsc(ifscCode, offset, limit);
	}

	@GetMapping("/branches{?bankName,city,limit,offset}")
	public List<BankDetails> getByName(@RequestParam("bankName") String bankName, @RequestParam("city") String city,
			@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		return service.getBankByBankNameAndCity(bankName, city, offset, limit);
	}

}
