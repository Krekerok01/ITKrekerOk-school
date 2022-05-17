package com.varvara.questionnairedemo.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @NotBlank(message = "The field is required")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "The field is required")
    private String lastName;

    @Column(name = "email")
    @Email(regexp = "[a-zA-Z0-9]+@gmail.com", message = "It must be a valid email and end with 'gmail.com'")
    private String email;

    @Column(name = "age")
    @NotNull(message = "The field is required")
    @Min(value = 14, message = "must be greater than or equal 14")
    @Max(value = 99, message = "must be less than or equal 99")
    private int age;

    @Column(name = "course")
    private String course;

    public Student() {

    }

    public Student(int id, String firstName, String lastName, String email, int age, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
