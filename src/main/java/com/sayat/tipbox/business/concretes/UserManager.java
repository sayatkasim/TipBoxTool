package com.sayat.tipbox.business.concretes;


import com.sayat.tipbox.business.abstracts.UserService;
import com.sayat.tipbox.core.dataAccess.UserDao;
import com.sayat.tipbox.core.entities.User;
import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.core.utilities.results.SuccessDataResult;
import com.sayat.tipbox.core.utilities.results.SuccessResult;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;
    public UserManager(UserDao userDao) {
        super();this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Oluşturuldu");
    }

    @Override
    public DataResult<User> getByIdentityNumber(String identityNumber) {
        return new SuccessDataResult<User>(this.userDao.getByIdentityNumber(identityNumber),
                "Kullanıcı bulundu");
    }
}
