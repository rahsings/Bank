package com.fyle.bank.security;

import org.springframework.stereotype.Component;

import com.fyle.bank.model.JwtUser;
import com.fyle.bank.utils.Constant;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	public JwtUser validate(String token) {

		JwtUser jwtUser = null;
		try {
			Claims body = Jwts.parser().setSigningKey(Constant.BANK_DETAILS).parseClaimsJws(token).getBody();

			jwtUser = new JwtUser();

			jwtUser.setUserName(body.getSubject());
			jwtUser.setId(Long.parseLong((String) body.get(Constant.USER_ID)));
			jwtUser.setRole((String) body.get(Constant.ROLE));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jwtUser;
	}
}
