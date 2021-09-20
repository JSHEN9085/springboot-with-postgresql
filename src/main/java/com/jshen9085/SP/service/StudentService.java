package com.jshen9085.SP.service;


import com.jshen9085.SP.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(
              1L,
              "Mariam",
                LocalDate.of(1990, Month.AUGUST, 5),
                31,
                "Mariam@gmail.com"
        ));
    }
}
