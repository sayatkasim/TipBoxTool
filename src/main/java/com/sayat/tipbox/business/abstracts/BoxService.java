package com.sayat.tipbox.business.abstracts;

import com.sayat.tipbox.core.utilities.results.Result;
import com.sayat.tipbox.entities.concretes.Box;

import java.util.List;

public interface BoxService {
    List<Box> getAll();
    Result add(Box box);
    Result delete(Box box);
    Result update (Box box);
}
