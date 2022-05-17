package com.varvara.questionnairedemo.service;

import com.varvara.questionnairedemo.entity.Teacher;

import java.util.List;

public interface TeacherService {

    public List<Teacher> findAll();

    public Teacher findById(int id);

    public void save(Teacher teacher);

    public void deleteById(int id);
}
