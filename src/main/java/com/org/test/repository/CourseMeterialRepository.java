package com.org.test.repository;

import com.org.test.entity.CourseMeterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMeterialRepository extends JpaRepository<CourseMeterial,Long>{

}