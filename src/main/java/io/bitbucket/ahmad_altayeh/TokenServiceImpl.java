package io.bitbucket.ahmad_altayeh;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class TokenServiceImpl implements TokenService{

    public TokenServiceImpl() {
    }

    @Override
    public String generateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 640000 * 1000))
                .signWith(SignatureAlgorithm.HS512, "secret").compact();
    }
}
