package com.org.test.controller;

import com.org.test.entity.Department;
import com.org.test.error.DepartmentNotFoundException;
import com.org.test.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment( @RequestBody Department department){

        return  departmentService.saveDepartment(department);
    }


    @GetMapping("/depatments")
    public List<Department> fetchDepartment(){

        return departmentService.fetchDepartment();
    }

    @GetMapping("/deparments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {

        return  departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/deparments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){

        departmentService.deleteDepartmentById(departmentId);

      return "Department deleted";
    }


}
