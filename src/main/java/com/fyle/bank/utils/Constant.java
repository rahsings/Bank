package com.fyle.bank.utils;

public class Constant {

	public static final Long ExpDate = 432000000l;
	public static final String BANK_DETAILS = "bankdetails";
	public static final String USER_ID = "userId";
	public static final String ROLE = "role";
	public static final String AUTHORIZATION = "Authorization";
	public static final String TOKEN_MISSING = "JWT Token is missing";
	public static final String TOKEN_INCORRECT = "JWT Token is incorrect";
	public static final String BLANK = "";
	public static final String API = "**/api/**";
	public static final String AUTHENTICATION_API = "/api/**";
	public static final String UNAUTHORIZED ="UNAUTHORIZED";
	public static final String SUCESSFULLY_AUTHICATED = "Successfully Authentication";
	public static final int ZERO = 0;
	public static final String IFSC_QUERY ="SELECT e FROM BankDetails e WHERE e.ifsc= :ifsc";
	public static final String BANK_NAME_QUERY ="SELECT e FROM BankDetails e WHERE "
			+ "LOWER(e.city) LIKE LOWER(CONCAT('%',:city, '%')) AND "
			+ "LOWER(e.bank_name) LIKE LOWER(CONCAT('%',:bankName, '%')) " + "ORDER BY e.ifsc";
	

}
