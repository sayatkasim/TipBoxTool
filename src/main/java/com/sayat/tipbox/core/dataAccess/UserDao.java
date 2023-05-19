package com.sayat.tipbox.core.dataAccess;

import com.sayat.tipbox.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User getByIdentityNumber(String identityNumber);
}
