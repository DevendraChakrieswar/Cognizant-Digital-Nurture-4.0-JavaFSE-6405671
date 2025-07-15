package com.cognizant.spring_learn.Hands_on_JWT_exercise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START - authenticate()");
        LOGGER.debug("Authorization Header: {}", authHeader);

        Map<String, String> map = new HashMap<>();
        String user = getUser(authHeader);

        String token = generateJwt(user);


        map.put("token", token);

        LOGGER.info("END - authenticate()");
        return map;
    }



    private String getUser(String authHeader) {
        // authHeader format: "Basic base64encoded(username:password)"
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(base64Credentials);
        String decodedCredentials = new String(decodedBytes);
        // decodedCredentials format: "username:password"
        String username = decodedCredentials.split(":")[0];
        LOGGER.debug("Decoded username: {}", username);
        return username;
    }

    private String generateJwt(String user) {
        JwtBuilder builder = Jwts.builder();

        builder.setSubject(user);

        builder.setIssuedAt(new Date());

        // Token expires 20 minutes from now
        builder.setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000));

        builder.signWith(SignatureAlgorithm.HS256, "secretkey");

        return builder.compact();
    }

}

