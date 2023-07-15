package com.example.spring_lesson.newjpaproject.repository;

import com.example.spring_lesson.newjpaproject.entity.Students;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Long> {
    Students findByName(String name);
}
