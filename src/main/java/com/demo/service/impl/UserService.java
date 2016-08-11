
package com.demo.service.impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.demo.dao.IUserDao;
import com.demo.dao.common.IOperations;
import com.demo.model.UserModel;
import com.demo.service.IUserService;
import com.demo.service.common.AbstractService;

@Service("userService")
public class UserService extends AbstractService<UserModel> implements IUserService {

    @Resource(name="usersDao")
    private IUserDao dao;
    
    public UserService() {
        super();
    }

    @Override
    protected IOperations<UserModel> getDao() {
        return this.dao;
    }
}