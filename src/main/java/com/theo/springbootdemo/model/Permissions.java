package com.theo.springbootdemo.model;

import com.theo.springbootdemo.base.BaseModel;

public class Permissions extends BaseModel
{

        private String permissionName;

        public String getPermissionName()
        {
                return permissionName;
        }

        public void setPermissionName(String permissionName)
        {
                this.permissionName = permissionName;
        }
}
