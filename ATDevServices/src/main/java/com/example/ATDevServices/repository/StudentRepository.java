package com.example.ATDevServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ATDevServices.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
