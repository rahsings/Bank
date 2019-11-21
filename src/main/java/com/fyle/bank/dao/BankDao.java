package com.fyle.bank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fyle.bank.model.BankDetails;
import com.fyle.bank.utils.Constant;;

@Repository
@Transactional(readOnly = true)
public class BankDao implements BankInterface {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<BankDetails> findBankByIfsc(String ifsc, int offset, int limit){
		Query query = entityManager.createQuery(Constant.IFSC_QUERY);
		query.setParameter("ifsc", ifsc);
		List<BankDetails> ifscDetails = query.getResultList();
		return (offset + limit < ifscDetails.size()) ? ifscDetails.subList(offset, offset + limit)
				: ifscDetails.subList(offset, ifscDetails.size());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BankDetails> findBanksByName(String bankName, String city, int offset, int limit) {
		Query query = entityManager.createQuery(Constant.BANK_NAME_QUERY);
		query.setParameter("bankName", bankName);
		query.setParameter("city", city);
		List<BankDetails> branchDetails = query.getResultList();
		return (offset + limit < branchDetails.size()) ? branchDetails.subList(offset, offset + limit)
				: branchDetails.subList(offset, branchDetails.size());
	}
	
}