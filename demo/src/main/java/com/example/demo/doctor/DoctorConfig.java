package com.example.demo.doctor;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class DoctorConfig {


    @Bean
    CommandLineRunner commandLineRunner1(DoctorRepository repository) {
        return args -> {
            Doctors pavan_kumar = new Doctors(
                    "pavan",
                    "test@test.com",
                    1234567L,
                    "vizag",
                    "general"
            );
            Doctors naveen = new Doctors(
                    "naveen",
                    "test1@test.com",
                    123787L,
                    "hyderabad",
                    "ear"
            );
            repository.saveAll(List.of(pavan_kumar,naveen));
        };


    }
}
