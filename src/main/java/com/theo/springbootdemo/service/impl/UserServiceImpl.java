package com.theo.springbootdemo.service.impl;

import com.theo.springbootdemo.model.User;
import com.theo.springbootdemo.model.dao.UserDao;
import com.theo.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService
{

        @Autowired
        private UserDao userDao;

        @Override
        public List<User> getUsers()
        {

                return userDao.getAll();
        }
}
