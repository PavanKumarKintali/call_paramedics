package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            Users pavan_kumar = new Users(
                    "Pavan Kumar",
                    "test@test.com",
                    123456789L,
                    "vizag"
            );
            Users pavan = new Users(

                    "Pavan",
                    "test1@test.com",
                    987654321L,
                    "mumbai"
            );

            repository.saveAll(
                    List.of(pavan_kumar,pavan)
            );
        };
    }
}
