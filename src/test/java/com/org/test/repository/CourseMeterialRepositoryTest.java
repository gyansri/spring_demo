package com.org.test.repository;

import com.org.test.entity.Course;
import com.org.test.entity.CourseMeterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMeterialRepositoryTest {

    @Autowired
    private CourseMeterialRepository courseMeterialRepository;

    @Test
    public void saveCourseMeterial(){

        Course course=Course.builder()
                .title("DSA")
                .credit(6)
                .build();
        CourseMeterial courseMeterial = CourseMeterial.builder()
                .url("www.google.com")
                .course(course)
                .build();

        courseMeterialRepository.save(courseMeterial);
    }

    @Test
    public void printAllCourse(){
        List<CourseMeterial> courseMeterialList = courseMeterialRepository.findAll();

    }
}