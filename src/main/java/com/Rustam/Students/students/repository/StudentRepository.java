package com.Rustam.Students.students.repository;

import com.Rustam.Students.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
}
