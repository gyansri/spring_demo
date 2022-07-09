package com.org.test.repository;

import com.org.test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String name);

    @Query("select s  from Student s where s.emailId = ?1 ")
    Student getStrudentByEmail(String email);

    @Query(
            value = "select * from tbl_student s where s.last_name = ?1",
            nativeQuery = true
    )
    Student getStudentByLastName(String lastname);


    @Transactional
    @Modifying
    @Query(
            value = "update tbl_student set first_name =?1 where email_address =?2",
            nativeQuery = true
    )
    int upadateStudetNameByEmailId(String name, String emailId);

}
