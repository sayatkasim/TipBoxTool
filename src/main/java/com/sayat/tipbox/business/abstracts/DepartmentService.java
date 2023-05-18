package com.sayat.tipbox.business.abstracts;

import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();

    Result add (Department department);
}
