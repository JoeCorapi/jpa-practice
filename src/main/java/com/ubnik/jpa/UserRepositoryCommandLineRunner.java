package com.ubnik.jpa;

import com.ubnik.jpa.jpapractice.entity.User;
import com.ubnik.jpa.service.UserDAOService;
import com.ubnik.jpa.service.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final org.slf4j.Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User is created : " + user);

    }
}
