package com.fyle.bank.security;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fyle.bank.model.JwtUser;
import com.fyle.bank.utils.Constant;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

	public String generate(JwtUser jwtUser) {

		Date date = new Date();
        long time = date.getTime();
        Date exp = new Date(time + Constant.ExpDate);
		Claims claims = Jwts.claims().setSubject(jwtUser.getUserName());
		claims.put(Constant.USER_ID, String.valueOf(jwtUser.getId()));
		claims.put(Constant.ROLE, jwtUser.getRole());

		return Jwts.builder().setClaims(claims).setExpiration(exp).signWith(SignatureAlgorithm.HS512,Constant.BANK_DETAILS).compact();
	}
}
