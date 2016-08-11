package com.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.dao.IUserDao;
import com.demo.dao.common.AbstractHibernateDao;
import com.demo.model.UserModel;

@Repository("usersDao")
public class UserDao extends AbstractHibernateDao<UserModel> implements IUserDao {

    public UserDao() {
        super();
        setClazz(UserModel.class);
    }
}