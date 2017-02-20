package com.denghb.spring.cloud.service;

import com.denghb.dbhelper.DbHelper;
import com.denghb.spring.cloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by denghb on 2017/2/19.
 */
public interface UserService {

    public void create(User user);

}
