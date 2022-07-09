package com.org.test.repository;

import com.org.test.entity.Guardian;
import com.org.test.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;


    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .firstName("gps")
                .emailId("gps@gmail.com")
                .lastName("srivastava").build();
//                .guardianName("test")
//                .guardianEmail("test@gmail.com")
//                .guardianMobile("9898989999").build();

           studentRepository.save(student);

    }

    @Test
    public void saveStudentWithoutGuardian(){
        Guardian guardian = Guardian.builder()
                .email("test@gmail.com")
                .mobile("78696980669")
                .name("test")
                .build();
        Student student=Student.builder()
                .firstName("gps")
                .emailId("gps@gmail.com")
                .lastName("srivastava")
                .guardian(guardian)
                .build();
         studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){


        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }

    @Test
    public void printStudentByFirstName(){
      List<Student> studentslist = studentRepository.findByFirstName("gps");

        System.out.println(studentslist);

    }

    @Test
    public void printStudentByFirstNameConataining(){
        List<Student> studentslist = studentRepository.findByFirstNameContaining("g");

        System.out.println(studentslist);
    }

    @Test
    public void printStudentByLastName(){

        Student student = studentRepository.getStrudentByEmail("srivastava");

        System.out.println(student);

    }

    @Test
    public void printStudentByLastNameex(){

        Student student = studentRepository.getStudentByLastName("srivastava");
    }

    @Test
    public void upadteStudent(){

        int val = studentRepository.upadateStudetNameByEmailId("gyan","gps@gmail.com");
    }

}