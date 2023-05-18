package com.sayat.tipbox.dataAccess.abstracts;

import com.sayat.tipbox.entities.concretes.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,Integer> {
}
