package com.sayat.tipbox.business.concretes;

import com.sayat.tipbox.business.abstracts.BoxService;
import com.sayat.tipbox.dataAccess.abstracts.BoxDao;
import com.sayat.tipbox.entities.concretes.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoxManager implements BoxService {

    private BoxDao boxDao;
    @Autowired
    public BoxManager(BoxDao boxDao) {
        this.boxDao = boxDao;
    }
    @Override
    public List<Box> getAll() {
        return this.boxDao.findAll();
    }
}
