package com.varvara.questionnairedemo.service;

import com.varvara.questionnairedemo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StudentService {

    public List<Student> findAll();

    public Student findById(int id);

    public void save(Student student);

    public void deleteById(int id);
}
