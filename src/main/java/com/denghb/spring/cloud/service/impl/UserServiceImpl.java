package com.denghb.spring.cloud.service.impl;

import com.denghb.dbhelper.DbHelper;
import com.denghb.spring.cloud.domain.User;
import com.denghb.spring.cloud.service.UserService;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by denghb on 2017/2/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DbHelper db;

    // 事务配置
    @Transactional
    public void create(User user){
        db.insert(user);
    }

}
