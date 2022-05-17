package com.varvara.questionnairedemo.dao;


import com.varvara.questionnairedemo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
