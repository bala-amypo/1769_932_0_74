package com.example.demo.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;

public class JwtUtil {

private final Key key;
private final long expiry;

public JwtUtil(String secret, long exp) {
this.key = Keys.hmacShaKeyFor(secret.getBytes());
this.expiry = exp;
}

public String generateToken(Long userId, String email, String role) {
return Jwts.builder()
.claim("userId", userId)
.claim("email", email)
.claim("role", role)
.setIssuedAt(new Date())
.setExpiration(new Date(System.currentTimeMillis() + expiry))
.signWith(key)
.compact();
}

public Jws<Claims> validateToken(String token) {
return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
}
}
