package com.Rustam.Students.students.service;

import com.Rustam.Students.students.model.Student;
import com.Rustam.Students.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService  {

    @Autowired
    private StudentRepository studentRepository;

    public Student findById(Long id) {
      return studentRepository.getOne(id);
    }

    public List<Student> findAll(){
       return studentRepository.findAll();
    }

    public Student saveStudent (Student student) {
      return studentRepository.save(student);
    }

    public void deleteById(Long id) {
       studentRepository.deleteById(id);
    }
}
