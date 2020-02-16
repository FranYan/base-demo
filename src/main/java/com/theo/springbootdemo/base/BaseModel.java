package com.theo.springbootdemo.base;

import java.util.Date;

public class BaseModel
{
        private Long id;

        private int deleted;

        private Date createTime;

        public Long getId()
        {
                return id;
        }

        public void setId(Long id)
        {
                this.id = id;
        }

        public int getDeleted()
        {
                return deleted;
        }

        public void setDeleted(int deleted)
        {
                this.deleted = deleted;
        }

        public Date getCreateTime()
        {
                return createTime;
        }

        public void setCreateTime(Date createTime)
        {
                this.createTime = createTime;
        }
}
