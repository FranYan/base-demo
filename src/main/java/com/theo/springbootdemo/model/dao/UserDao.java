package com.theo.springbootdemo.model.dao;

import com.theo.springbootdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao
{
        @Select("select ID id,username,password from user")
        List<User> getAll();
}
