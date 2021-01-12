package com.xing.erp.sys.model;

public class User {
    private Long userid;

    private String username;

    private String userpwd;

    private Integer userflag;

    public User(Long userid, String username, String userpwd, Integer userflag) {
        this.userid = userid;
        this.username = username;
        this.userpwd = userpwd;
        this.userflag = userflag;
    }

    public User() {
        super();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
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
}