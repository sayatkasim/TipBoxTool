package com.sayat.tipbox.business.concretes;

import com.sayat.tipbox.business.abstracts.DepartmentService;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.core.utilities.results.SuccessResult;
import com.sayat.tipbox.dataAccess.abstracts.DepartmentDao;
import com.sayat.tipbox.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentManager implements DepartmentService {
    private DepartmentDao departmentDao;
    @Autowired
    public DepartmentManager(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }
    @Override
    public List<Department> getAll() {
        return this.departmentDao.findAll();
    }

    @Override
    public Result add(Department department) {
        this.departmentDao.save(department);
        return new SuccessResult("Departman eklendi");
    }
}
