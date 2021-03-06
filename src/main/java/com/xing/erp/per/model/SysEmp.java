package com.xing.erp.per.model;

import com.xing.erp.sys.model.TreeNode;

import java.util.Date;
import java.util.List;

public class SysEmp {
    private Integer uuid;

    private String username;

    private String pwd;

    private String name;

    private Integer gender;

    private String email;

    private String tele;

    private String address;

    private Date birthday;

    private Integer depuuid;

    private List<TreeNode> listmenu;

    public List<TreeNode> getListmenu() {
        return listmenu;
    }

    public void setListmenu(List<TreeNode> listmenu) {
        this.listmenu = listmenu;
    }

    public SysEmp(Integer uuid, String username, String pwd, String name, Integer gender, String email, String tele, String address, Date birthday, Integer depuuid) {
        this.uuid = uuid;
        this.username = username;
        this.pwd = pwd;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.tele = tele;
        this.address = address;
        this.birthday = birthday;
        this.depuuid = depuuid;
    }

    public SysEmp() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "SysEmp{" +
                "uuid=" + uuid +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", tele='" + tele + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", depuuid=" + depuuid +
                ", listmenu=" + listmenu +
                '}';
    }
}