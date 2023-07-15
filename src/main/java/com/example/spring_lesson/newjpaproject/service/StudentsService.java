package com.example.spring_lesson.newjpaproject.service;

import com.example.spring_lesson.newjpaproject.entity.Students;
import com.example.spring_lesson.newjpaproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentsService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentsService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public void addStudent(String name, String course){
        Students students = new Students();
        students.setName(name);
        students.setCourses(course);
        studentRepository.save(students);
    }
    public void deleteStudent(String name){
        Students students = studentRepository.findByName(name);
        if(students != null){
            studentRepository.delete(students);
        }
    }

}
