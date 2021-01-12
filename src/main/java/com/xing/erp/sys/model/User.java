package com.xing.erp.sys.model;

import lombok.Builder;

import java.util.Date;

@Builder
public class User {
    private Integer userid;

    private String username;

    private String userpwd;

    private Integer userflag;

    private String realname;

    private Integer gender;

    private String email;

    private String tele;

    private String address;

    private Date birthday;

    private Integer depuuid;

    public User(Integer userid, String username, String userpwd, Integer userflag, String realname, Integer gender, String email, String tele, String address, Date birthday, Integer depuuid) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.userflag = userflag;
        this.realname = realname;
        this.gender = gender;
        this.email = email;
        this.tele = tele;
        this.address = address;
        this.birthday = birthday;
        this.depuuid = depuuid;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Integer getUserflag() {
        return userflag;
    }

    public void setUserflag(Integer userflag) {
        this.userflag = userflag;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getDepuuid() {
        return depuuid;
    }

    public void setDepuuid(Integer depuuid) {
        this.depuuid = depuuid;
    }
}