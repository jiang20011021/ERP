package com.xing.erp.sys.model;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Role {
    private Long roleid;

    private String rolename;

    private String roledesc;

    private Integer roleflag;

    public Role(Long roleid, String rolename, String roledesc, Integer roleflag) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.roledesc = roledesc;
        this.roleflag = roleflag;
    }

    public Role() {
        super();
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public Integer getRoleflag() {
        return roleflag;
    }

    public void setRoleflag(Integer roleflag) {
        this.roleflag = roleflag;
    }
}