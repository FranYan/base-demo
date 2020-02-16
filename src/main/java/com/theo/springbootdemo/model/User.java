package com.theo.springbootdemo.model;

import com.theo.springbootdemo.base.BaseModel;

import java.io.Serializable;
import java.util.Set;

public class User extends BaseModel implements Serializable
{
    private String username;

    private String name;

    private String password;

    private String salt;

    private Set<Role> roles;

    public Set<Role> getRoles()
    {
        return roles;
    }

    public void setRoles(Set<Role> roles)
    {
        this.roles = roles;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSalt()
    {
        return salt;
    }

    public void setSalt(String salt)
    {
        this.salt = salt;
    }
}