package com.sayat.tipbox.business.abstracts;

import com.sayat.tipbox.core.entities.User;
import com.sayat.tipbox.core.utilities.results.DataResult;
import com.sayat.tipbox.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> getByIdentityNumber(String identityNumber);
}
