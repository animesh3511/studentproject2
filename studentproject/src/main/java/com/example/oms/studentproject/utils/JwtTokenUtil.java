package com.example.oms.studentproject.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtTokenUtil {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private int expiration;

    private static final SecretKey SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);


    public String generateToken(Long studentId)
    {
        Date now = new Date();

        Date expiryDate = new Date(now.getTime()+expiration);


        return Jwts.builder()
                   .setSubject(String.valueOf(studentId))
                   .setIssuedAt(now)
                   .setExpiration(expiryDate)
                //.signWith(getSecretKey(), SignatureAlgorithm.HS256)
                .signWith(SECRET_KEY)
                .compact();


    }

    public boolean validate(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(getSecretKey()).build().parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }


    public String getUsername(String token) {
        Claims claims = Jwts.parserBuilder().setSigningKey(getSecretKey()).build().parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

    public Long getStudentIdFromToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSecretKey())
                .build()
                .parseClaimsJws(token)
                .getBody();

        return Long.parseLong(claims.getSubject());
    }


    private SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }


}
