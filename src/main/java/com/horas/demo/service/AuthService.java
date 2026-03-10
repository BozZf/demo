package com.horas.demo.service;

import com.horas.demo.dto.request.AccountCredentialsDto;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity signin(AccountCredentialsDto accountCredentialsDto);

    ResponseEntity refreshToken(String username, String refreshToken);
}
