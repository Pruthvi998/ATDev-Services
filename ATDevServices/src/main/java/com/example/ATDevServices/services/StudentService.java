package com.example.ATDevServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ATDevServices.entity.Student;
import com.example.ATDevServices.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setFirstName(updatedStudent.getFirstName());
            existingStudent.setLastName(updatedStudent.getLastName());
            existingStudent.setAge(updatedStudent.getAge());
            existingStudent.setEmail(updatedStudent.getEmail());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

