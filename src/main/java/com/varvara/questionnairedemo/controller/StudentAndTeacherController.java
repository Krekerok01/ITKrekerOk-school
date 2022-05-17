package com.varvara.questionnairedemo.controller;


import com.varvara.questionnairedemo.entity.Student;
import com.varvara.questionnairedemo.entity.Teacher;
import com.varvara.questionnairedemo.service.StudentService;
import com.varvara.questionnairedemo.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class StudentAndTeacherController {

    private StudentService studentService;
    private TeacherService teacherService;

    private List<String> courses;

    public StudentAndTeacherController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;

        getAllCourses();
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String listStudentsAndTeachers(Model model){

        // get students from DB
        List<Student> students = studentService.findAll();
        List<Teacher> teachers = teacherService.findAll();

        for (Student student: students){
            int i = 0;
            for (String course: courses){
                if (student.getCourse().equals(course)){
                    i++;
                }
            }
            if (i == 0){
                student.setCourse("");
            }
        }

        // add to the spring model
        model.addAttribute("students", students);
        model.addAttribute("teachers", teachers);

        return "list-students-and-teachers.html";
    }

    @GetMapping("/info")
    public String showInfo(){
        return "info-page";
    }


    @GetMapping("/showFormForAddStudent")
    public String showFormForAddStudent(Model model){

        // create model attribute to bind form data
        Student student = new Student();

        getAllCourses();

        model.addAttribute("student", student);

        model.addAttribute("courses", courses);

        return "students/student-form";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") @Valid Student student, BindingResult result, Model model){

        if (result.hasErrors()){
            getAllCourses();
            model.addAttribute("courses", courses);
            return "students/student-form";
        }

        // save the student
        studentService.save(student);


        //use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdateStudent")
    public String showFormForUpdateStudent(@RequestParam("studentId") int id, Model model){

        // get the student from the service
        Student student = studentService.findById(id);

        // set student as a model attribute to pre-populate the form
        model.addAttribute("student", student);

        model.addAttribute("courses", courses);

        // send over to our form
        return "students/student-form";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("studentId") int id){

        // delete the student
        studentService.deleteById(id);

        // redirect to /employees/list
        return "redirect:/employees/list";
    }


    @GetMapping("/showFormForAddTeacher")
    public String showFormForAddTeacher(Model model){

        // create model attribute to bind form data
        Teacher teacher = new Teacher();

        model.addAttribute("teacher", teacher);

        return "teachers/teacher-form";
    }

    @PostMapping("/saveTeacher")
    public String saveTeacher(@ModelAttribute("teacher") @Valid Teacher teacher, BindingResult result){

        if (result.hasErrors()){
            return "teachers/teacher-form";
        }

        // save the teacher
        teacherService.save(teacher);
        getAllCourses();

        //use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdateTeacher")
    public String showFormForUpdateTeacher(@RequestParam("teacherId") int id, Model model){

        // get the teacher from the service
        Teacher teacher = teacherService.findById(id);

        // set teacher as a model attribute to pre-populate the form
        model.addAttribute("teacher", teacher);

        // send over to our form
        return "teachers/teacher-form";
    }

    @GetMapping("/deleteTeacher")
    public String deleteTeacher(@RequestParam("teacherId") int id){

        // delete the teacher
        teacherService.deleteById(id);
        getAllCourses();

        // redirect to /teacher/list
        return "redirect:/employees/list";
    }

    private void getAllCourses(){
        List<Teacher> teachers = teacherService.findAll();

        courses = new ArrayList<>();

        for (Teacher teacher: teachers){
            courses.add(teacher.getCourse());
        }
    }
}
