package com.varvara.questionnairedemo.service;

import com.varvara.questionnairedemo.dao.TeacherRepository;
import com.varvara.questionnairedemo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findById(int id) {
        Optional<Teacher> result = teacherRepository.findById(id);

        Teacher teacher = null;

        if (result.isPresent()){
            teacher = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Didn't find teacher id - " + id);
        }

        return teacher;
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }
}
