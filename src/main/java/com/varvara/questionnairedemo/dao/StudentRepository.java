package com.varvara.questionnairedemo.dao;

import com.varvara.questionnairedemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
