package com.jshen9085.SP.service;


import com.jshen9085.SP.model.Student;
import com.jshen9085.SP.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentEmail = studentRepository
                .findStudentByEmail(student.getEmail());

        if(studentEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean exists = studentRepository.existsById(studentId);
        if(exists){
            studentRepository.deleteById(studentId);
        } else {
            throw new IllegalStateException("Student with id " + studentId + " is not found!" );
        }
    }
}
