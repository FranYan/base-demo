package com.theo.springbootdemo.model;

import com.theo.springbootdemo.base.BaseModel;

import java.util.Set;

public class Role extends BaseModel
{

        private String roleName;

        private Set<Permissions> permissions;

        public Set<Permissions> getPermissions()
        {
                return permissions;
        }

        public void setPermissions(Set<Permissions> permissions)
        {
                this.permissions = permissions;
        }

        public String getRoleName()
        {
                return roleName;
        }

        public void setRoleName(String roleName)
        {
                this.roleName = roleName;
        }
}
