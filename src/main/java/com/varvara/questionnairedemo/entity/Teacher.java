package com.varvara.questionnairedemo.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "teacher")
public class Teacher {
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

    @Column(name = "experience_time")
    @NotNull(message = "The field is required")
    @Min(value = 1, message = "must be greater than or equal 1")
    @Max(value = 40, message = "must be less than or equal 40")
    private int experienceTime;

    @Column(name = "course")
    private String course;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, String email, int experienceTime, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.experienceTime = experienceTime;
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

    public int getExperienceTime() {
        return experienceTime;
    }

    public void setExperienceTime(int experienceTime) {
        this.experienceTime = experienceTime;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", experienceTime=" + experienceTime +
                ", course='" + course + '\'' +
                '}';
    }
}
