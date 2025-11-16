package com.example.financial.security.utils;


import com.example.financial.model.User;
import com.example.financial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthenticationUtil {

    @Autowired
    private UserRepository userRepository;

    public User getUserLogged(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        Optional<User> user = userRepository.findByUsername(username);
        if(user.isPresent()){ return user.get(); }
        else throw  new RuntimeException("Usuário não encontrado!");
    }
}
