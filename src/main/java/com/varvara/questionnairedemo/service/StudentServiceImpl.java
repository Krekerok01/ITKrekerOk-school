package com.varvara.questionnairedemo.service;

import com.varvara.questionnairedemo.dao.StudentRepository;
import com.varvara.questionnairedemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        Optional<Student> result = studentRepository.findById(id);

        Student student = null;

        if (result.isPresent()){
            student = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Didn't find student id - " + id);
        }

        return student;
    }

    @Override
    public void save(Student employee) {
        studentRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
