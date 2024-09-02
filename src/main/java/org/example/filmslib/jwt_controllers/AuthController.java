package org.example.filmslib.jwt_controllers;


import lombok.AllArgsConstructor;
import org.example.filmslib.dtos.AuthOrRegisterResponseDto;
import org.example.filmslib.dtos.AuthRequestDto;
import org.example.filmslib.dtos.RegisterRequestDto;
import org.example.filmslib.jwt_services.AuthOrRegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthOrRegisterService authOrRegisterService;
    private final Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/register")
    public AuthOrRegisterResponseDto register(@RequestBody RegisterRequestDto registerRequestDto) {
        return authOrRegisterService.register(registerRequestDto);
    }

    @PostMapping("/authenticate")
    public AuthOrRegisterResponseDto auth(@RequestBody AuthRequestDto authRequestDto) {
        try {
            return authOrRegisterService.auth(authRequestDto);
        } catch (Exception e) {
            e.printStackTrace();
            logger.warn("asd" + authRequestDto);
        }
        return null;
    }
}