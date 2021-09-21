package com.jshen9085.SP.repository;

import com.jshen9085.SP.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
