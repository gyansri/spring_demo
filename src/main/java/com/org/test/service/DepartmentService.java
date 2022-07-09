package com.org.test.service;

import com.org.test.entity.Department;
import com.org.test.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartment();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);
}
