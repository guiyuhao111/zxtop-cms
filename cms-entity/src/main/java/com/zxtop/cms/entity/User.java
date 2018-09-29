package com.zxtop.cms.entity;

import java.util.Date;
import java.util.UUID;

public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private Date createTime;
    private Date lastLoginTime;
    private Date modifiedTime;
    private  int state;

    public User() {
        userId=UUID.randomUUID().toString();
    }

    public User(String userId, String userName, String userPassword, Date createTime, Date lastLoginTime, Date modifiedTime, int state) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.createTime = createTime;
        this.lastLoginTime = lastLoginTime;
        this.modifiedTime = modifiedTime;
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
