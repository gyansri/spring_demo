package com.org.test.service;

import com.org.test.entity.Department;
import com.org.test.error.DepartmentNotFoundException;
import com.org.test.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department>  department =departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department not found ");
        }

        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
     departmentRepository.deleteById(departmentId);
    }
}
