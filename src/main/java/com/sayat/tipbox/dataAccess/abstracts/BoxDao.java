package com.sayat.tipbox.dataAccess.abstracts;

import com.sayat.tipbox.entities.concretes.Box;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxDao extends JpaRepository<Box,Integer> {
}
