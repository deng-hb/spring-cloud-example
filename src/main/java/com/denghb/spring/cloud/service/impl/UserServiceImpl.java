package com.denghb.spring.cloud.service.impl;

import com.denghb.dbhelper.DbHelper;
import com.denghb.spring.cloud.domain.User;
import com.denghb.spring.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by denghb on 2017/2/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DbHelper db;

    public void create(User user){
        db.insert(user);
    }

}
