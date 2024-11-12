package com.arthur.usajili.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="api/vi/registration")
@AllArgsConstructor

public class RegistrationController {
    private RegistrationService registrationService;
    //method that registers the person
    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
