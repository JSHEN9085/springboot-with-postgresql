package com.jshen9085.SP.configuration;


import com.jshen9085.SP.model.Student;
import com.jshen9085.SP.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    LocalDate.of(1990, Month.AUGUST, 5),
                    31,
                    "Mariam@gmail.com"
            );
            Student alex = new Student(
                    2L,
                    "Alex",
                    LocalDate.of(1989, Month.JANUARY, 1),
                    32,
                    "Alex@gmail.com"
            );
            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}
